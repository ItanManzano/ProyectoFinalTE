document.addEventListener('DOMContentLoaded', function() {
    // Interactividad de las categorías en pills
    const categoryPills = document.querySelectorAll('.category-pill');
    const categorySelect = document.getElementById('categoria');

    categoryPills.forEach(pill => {
        pill.addEventListener('click', function() {
            const value = this.getAttribute('data-value');
            categorySelect.value = value;

            // Actualizar estado activo
            categoryPills.forEach(p => p.classList.remove('active'));
            this.classList.add('active');
        });
    });

    // Establecer estado activo inicial basado en el valor seleccionado
    if (categorySelect.value) {
        const activePill = document.querySelector(`.category-pill[data-value="${categorySelect.value}"]`);
        if (activePill) activePill.classList.add('active');
    }

    // Validación básica de formulario
    const form = document.querySelector('form');
    const inputs = form.querySelectorAll('input[required], select[required]');

    inputs.forEach(input => {
        input.addEventListener('blur', function() {
            validateInput(this);
        });

        input.addEventListener('input', function() {
            if (this.classList.contains('is-invalid')) {
                validateInput(this);
            }
        });
    });

    form.addEventListener('submit', function(e) {
        let isValid = true;

        inputs.forEach(input => {
            if (!validateInput(input)) {
                isValid = false;
            }
        });

        if (!isValid) {
            e.preventDefault();
        }
    });

    function validateInput(input) {
        if (!input.value.trim()) {
            input.classList.add('is-invalid');

            // Eliminar cualquier mensaje de error existente
            const nextSibling = input.nextElementSibling;
            if (nextSibling && nextSibling.classList.contains('invalid-feedback')) {
                nextSibling.remove();
            }

            // Añadir mensaje de error
            const feedback = document.createElement('div');
            feedback.classList.add('invalid-feedback');
            feedback.innerText = 'Este campo es obligatorio';
            input.parentNode.insertBefore(feedback, input.nextSibling);

            return false;
        } else {
            input.classList.remove('is-invalid');
            input.classList.add('is-valid');

            // Eliminar mensaje de error si existe
            const nextSibling = input.nextElementSibling;
            if (nextSibling && nextSibling.classList.contains('invalid-feedback')) {
                nextSibling.remove();
            }

            return true;
        }
    }
});