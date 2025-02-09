package zoom.exporter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EXPORTER")
public class Exporter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int exporterCode;
	
	private String exporterName;
	
	public int getExporterCode() {
		return exporterCode;
	}
	public void setExporterCode(int exporterCode) {
		this.exporterCode = exporterCode;
	}
	public String getExporterName() {
		return exporterName;
	}
	public void setExporterName(String exporterName) {
		this.exporterName = exporterName;
	}
	public Exporter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exporter(int exporterCode, String exporterName) {
		super();
		this.exporterCode = exporterCode;
		this.exporterName = exporterName;
	}
	@Override
	public String toString() {
		return "Exporter [exporterCode=" + exporterCode + ", exporterName=" + exporterName + "]";
	}
	
	
}
