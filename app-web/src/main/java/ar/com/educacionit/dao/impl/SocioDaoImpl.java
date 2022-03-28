package ar.com.educacionit.dao.impl;

import ar.com.educacionit.dao.ICrud;
import ar.com.educacionit.domain.Socios;

public class SocioDaoImpl implements ICrud {
	

public Socios create(Socios socio) {
	// mas adelante veremos como conectarnos a la db
	//insertar datos
	String sql = "Insert into socios(nombre, apellido, email, direccion) Values('Carlos','lopez','krloss@gmail.com','av siempre viva 46')";
	System.out.println("Ejecutando sql"+ sql);
	return new Socios(10L,"Carlos","Lopez","krloss@gmail.com","av siempre viva 46",1l);
}

public Socios FindById(Long id) {
	String sql ="SELECT * FROM SOCIOS WHERE ID= "+ id;

	return new Socios(id,"Carlos","Lopez","krloss@gmail.com","av siempre viva 46",1l);

}
}

