// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarUsuarios();
  $('#usuarios').DataTable();
  cargarMailUsuario();
});

function cargarMailUsuario() {
  document.getElementById('userMail').outerHTML = localStorage.email;
}

function getHeaders() {
  return {
    'Accept': 'application/json',
    'Content-Type': 'application/json', 
    'Authorization': localStorage.token
  };
}

async function cargarUsuarios() {
  const request = await fetch('api/usuarios', {
    method: 'GET',
    headers: getHeaders()
  });
  const usuarios = await request.json();

  
  let listadoHtml = '';
  for(let usuario of usuarios) {
    let botonEliminar = '<a href="#" onClick="eliminarUsuario('+usuario.id+')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';

    let usuarioHtml = '<tr><td>'+usuario.id+'</td><td>'+usuario.nombre
      +' '+usuario.apellido
      +'</td><td>'+usuario.email
      +'</td><td>'+usuario.telefono
      +'</td><td>'+ botonEliminar +'</td></tr>';
    listadoHtml += usuarioHtml;
  }
  
  document.querySelector('#usuarios tbody').outerHTML = listadoHtml;

  }

  async function eliminarUsuario(id) {

    if(!confirm('¿Desea eliminar el usuario?')) {
      return;
    }
    const request = await fetch('api/usuarios/'+ id, {
      method: 'DELETE',
      headers: getHeaders()
    });

    location.reload();
  }
