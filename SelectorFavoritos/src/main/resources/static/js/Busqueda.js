// Variables para mantener el estado
let currentSearchTerm = '';
let currentFilter = 'todos';

// Función para aplicar ambos filtros (texto y categoría)
function applyFilters() {
    const items = document.querySelectorAll('.favorite-item');
    let hasVisibleItems = false;

    items.forEach(item => {
        // Verificar filtro de categoría primero
        const category = item.getAttribute('data-category').toLowerCase();
        const categoryMatch = currentFilter === 'todos' || category === currentFilter.toLowerCase();

        // Verificar filtro de texto si pasa el de categoría
        let textMatch = true;
        if (currentSearchTerm && categoryMatch) {
            const title = item.querySelector('.card-title').textContent.toLowerCase();
            const description = item.querySelector('.card-text').textContent.toLowerCase();
            const tags = item.querySelectorAll('.tag-badge');

            let tagMatch = false;
            tags.forEach(tag => {
                if (tag.textContent.toLowerCase().includes(currentSearchTerm)) {
                    tagMatch = true;
                }
            });

            textMatch = title.includes(currentSearchTerm) ||
                description.includes(currentSearchTerm) ||
                tagMatch;
        }

        // Mostrar u ocultar según ambos filtros
        if (categoryMatch && textMatch) {
            item.style.display = 'block';
            hasVisibleItems = true;
        } else {
            item.style.display = 'none';
        }
    });

    // Mostrar estado vacío si no hay coincidencias
    const emptyState = document.getElementById('emptyState');
    if (emptyState) {
        emptyState.style.display = hasVisibleItems || items.length === 0 ? 'none' : 'block';
    }
}

// Búsqueda en tiempo real
document.getElementById('searchInput').addEventListener('input', function(e) {
    currentSearchTerm = e.target.value.toLowerCase();
    applyFilters();
});

// Botón de búsqueda (por si acaso)
document.querySelector('.search-btn').addEventListener('click', function() {
    currentSearchTerm = document.getElementById('searchInput').value.toLowerCase();
    applyFilters();
});

// Filtrado por categoría
document.querySelectorAll('.filter-btn').forEach(btn => {
    btn.addEventListener('click', function() {
        // Remover clase activa de todos los botones
        document.querySelectorAll('.filter-btn').forEach(b => {
            b.classList.remove('active');
        });

        // Agregar clase activa al botón clickeado
        this.classList.add('active');

        // Actualizar filtro y aplicar
        currentFilter = this.getAttribute('data-filter');
        applyFilters();
    });
});

// Aplicar filtros al cargar la página (por si hay parámetros en la URL)
document.addEventListener('DOMContentLoaded', function() {
    applyFilters();
});