//CREATE AND UPDATE
$(document).on("click", ".open-modal", function () {
    const currentTreeId = Number($(this).attr('id_arbol'));

    if (currentTreeId) {
        const currentTreeId = products.find(x => x.id === currentTreeId);
        $("#id").val(currentTree.id_arbol);
        $("#name_arbol").val(currentTree.name_arbol);
        $("#precio").val(currentTree.precio);
        $("#ruta_imagen").val(currentTree.ruta_imagen);
        $("#descripcion").val(currentTree.descripcion);
    }
});

$(document).on("click", "#saveTree", function () {
    $("#formTree").submit();
})

//Delete
$(document).on("click", ".btnDeleteProduct", function () {
    const currentTreeId = Number($(this).attr('id_arbol'));
    const currentTree = products.find(x => x.id === currentTreeId);
    $.ajax({
        url: 'tree/delete',
        contentType: "application/json",
        dataType: 'json',
        type: 'POST',
        success: function (result) {
            location.reload();
        },
        //here we are serialization the object
        data: JSON.stringify(currentTree)
    });
})