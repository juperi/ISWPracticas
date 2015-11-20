package persistencia.dto;

public class SucursalDTO {
	private int id;
	private String dirección;
	
	public SucursalDTO(int id, String dirección) {
		super();
		this.id = id;
		this.dirección = dirección;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	
}
