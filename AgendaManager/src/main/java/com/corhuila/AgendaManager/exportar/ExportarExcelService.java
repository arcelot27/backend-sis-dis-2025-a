
package com.corhuila.AgendaManager.exportar;

import com.corhuila.AgendaManager.Dto.FormularioCompletoDTO;
import com.corhuila.AgendaManager.service.FormularioService;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class ExportarExcelService {

    @Autowired
    private FormularioService formularioService;

    public byte[] generarPorFormulario(Long idFormulario) throws IOException {
        FormularioCompletoDTO dto = formularioService.obtenerFormularioCompleto(idFormulario);

        try (
                InputStream plantilla = new ClassPathResource("plantillas/AGENDA SEMESTRAL.xlsx").getInputStream();
                Workbook workbook = new XSSFWorkbook(plantilla);
                ByteArrayOutputStream out = new ByteArrayOutputStream()) {

            Sheet sheet = workbook.getSheet("16 semanas académicas");

            // DATOS PERSONALES
            sheet.getRow(5).getCell(2).setCellValue(dto.getNombres() + " " + dto.getApellidos()); // C6
            sheet.getRow(6).getCell(1).setCellValue(dto.getFacultad()); // B7
            sheet.getRow(6).getCell(5).setCellValue(dto.getPrograma()); // F7
            sheet.getRow(7).getCell(1).setCellValue(dto.getFecha()); // B8
            sheet.getRow(7).getCell(5).setCellValue(dto.getPeriodo()); // F8

            // DOCENCIA (1.1)
            sheet.getRow(13).getCell(0).setCellValue(dto.getNombreAsignatura()); // A14
            sheet.getRow(13).getCell(3).setCellValue(dto.getGrupo()); // D14
            sheet.getRow(13).getCell(3).setCellValue(dto.getPrograma()); // C14
            sheet.getRow(13).getCell(4).setCellValue(dto.getSede()); // E14
            sheet.getRow(13).getCell(5).setCellValue(s(dto.getHorasSemana())); // F14
            sheet.getRow(13).getCell(7).setCellValue(s(dto.getHorasSemestre())); // H14

            // 1.2 ACTIVIDADES ACADÉMICAS – UBICACIÓN FIJA (A24, D24, E24, F24, H24 EN
            // ADELANTE)
            insertarFila(sheet, 23, "Preparación de clase",
                    s(dto.getPrepHorasSemana()),
                    s(dto.getPrepHorasSemestre()),
                    s(dto.getPrepDescripcion()),
                    dto.getPrepProducto());

            insertarFila(sheet, 24, "Evaluación de aprendizajes",
                    s(dto.getEvalHorasSemana()),
                    s(dto.getEvalHorasSemestre()),
                    s(dto.getEvalDescripcion()),
                    dto.getEvalProducto());

            insertarFila(sheet, 25, "Eventos académicos",
                    s(dto.getEventosHorasSemana()),
                    s(dto.getEventosHorasSemestre()),
                    s(dto.getEventosDescripcion()),
                    dto.getEventosProducto());

            insertarFila(sheet, 26, "Acompañamiento académico",
                    s(dto.getAcompHorasSemana()),
                    s(dto.getAcompHorasSemestre()),
                    s(dto.getAcompDescripcion()),
                    dto.getAcompProducto());

            insertarFila(sheet, 27, "Cursos de formación",
                    s(dto.getCursoHorasSemana()),
                    s(dto.getCursoHorasSemestre()),
                    s(dto.getCursoDescripcion()),
                    dto.getCursoProducto());

            insertarFila(sheet, 28, "Asesorías en emprendimiento",
                    s(dto.getAsesoriaHorasSemana()),
                    s(dto.getAsesoriaHorasSemestre()),
                    s(dto.getAsesoriaDescripcion()),
                    dto.getAsesoriaProducto());

            // 2. LABORES CIENTÍFICAS - UBICACIÓN FIJA FILAS 33 A 37 (A34, D34, E34, F34,
            // H34 EN ADELANTE)
            insertarFilaCientifica(sheet, 30, "Semilleros",
                    s(dto.getSemillerosHorasSemana()),
                    s(dto.getSemillerosHorasSemestre()),
                    s(dto.getSemillerosDescripcion()),
                    s(dto.getSemillerosProducto()));

            insertarFilaCientifica(sheet, 31, "Propuestas",
                    s(dto.getPropuestasHorasSemana()),
                    s(dto.getPropuestasHorasSemestre()),
                    s(dto.getPropuestasDescripcion()),
                    s(dto.getPropuestasProducto()));

            insertarFilaCientifica(sheet, 32, "Proyectos",
                    s(dto.getProyectosHorasSemana()),
                    s(dto.getProyectosHorasSemestre()),
                    s(dto.getProyectosDescripcion()),
                    s(dto.getProyectosProducto()));

            insertarFilaCientifica(sheet, 33, "Dirección de grupos",
                    s(dto.getDireccionHorasSemana()),
                    s(dto.getDireccionHorasSemestre()),
                    s(dto.getDireccionDescripcion()),
                    s(dto.getDireccionProducto()));

            insertarFilaCientifica(sheet, 34, "Artículos científicos",
                    s(dto.getArticulosHorasSemana()),
                    s(dto.getArticulosHorasSemestre()),
                    s(dto.getArticulosDescripcion()),
                    s(dto.getArticulosProducto()));

            // 2. LABORES CIENTÍFICAS - UBICACIÓN FIJA EN FILAS 40-44 (A, D, E, F, H)
            insertarFila(sheet, 39, "Semilleros",
                    s(dto.getSemillerosHorasSemana()),
                    s(dto.getSemillerosHorasSemestre()),
                    s(dto.getSemillerosDescripcion()),
                    dto.getSemillerosProducto());

            insertarFila(sheet, 40, "Propuestas",
                    s(dto.getPropuestasHorasSemana()),
                    s(dto.getPropuestasHorasSemestre()),
                    s(dto.getPropuestasDescripcion()),
                    dto.getPropuestasProducto());

            insertarFila(sheet, 41, "Proyectos",
                    s(dto.getProyectosHorasSemana()),
                    s(dto.getProyectosHorasSemestre()),
                    s(dto.getProyectosDescripcion()),
                    dto.getProyectosProducto());

            insertarFila(sheet, 42, "Dirección grupos",
                    s(dto.getDireccionHorasSemana()),
                    s(dto.getDireccionHorasSemestre()),
                    s(dto.getDireccionDescripcion()),
                    dto.getDireccionProducto());

            insertarFila(sheet, 43, "Artículos científicos",
                    s(dto.getArticulosHorasSemana()),
                    s(dto.getArticulosHorasSemestre()),
                    s(dto.getArticulosDescripcion()),
                    dto.getArticulosProducto());

            // 3. LABORES DE EXTENSIÓN Y CULTURALES - UBICACIÓN FIJA (A40-H45)
            insertarFila(sheet, 49, "Consultoría",
                    s(dto.getExtensionConsultoriaHorasSemana()),
                    s(dto.getExtensionConsultoriaHorasSemestre()),
                    s(dto.getExtensionConsultoriaDescripcion()),
                    dto.getExtensionConsultoriaProducto());

            insertarFila(sheet, 50, "Acompañamiento empresarial",
                    s(dto.getExtensionEmpresarialHorasSemana()),
                    s(dto.getExtensionEmpresarialHorasSemestre()),
                    s(dto.getExtensionEmpresarialDescripcion()),
                    dto.getExtensionEmpresarialProducto());

            insertarFila(sheet, 51, "Intervención comunitaria",
                    s(dto.getExtensionComunitariaHorasSemana()),
                    s(dto.getExtensionComunitariaHorasSemestre()),
                    s(dto.getExtensionComunitariaDescripcion()),
                    dto.getExtensionComunitariaProducto());

            insertarFila(sheet, 52, "Proyectos culturales",
                    s(dto.getCulturalProyectosHorasSemana()),
                    s(dto.getCulturalProyectosHorasSemestre()),
                    s(dto.getCulturalProyectosDescripcion()),
                    dto.getCulturalProyectosProducto());

            insertarFila(sheet, 53, "Educación artística",
                    s(dto.getCulturalEducacionHorasSemana()),
                    s(dto.getCulturalEducacionHorasSemestre()),
                    s(dto.getCulturalEducacionDescripcion()),
                    dto.getCulturalEducacionProducto());

            insertarFila(sheet, 54, "Divulgación de valores",
                    s(dto.getCulturalValoresHorasSemana()),
                    s(dto.getCulturalValoresHorasSemestre()),
                    s(dto.getCulturalValoresDescripcion()),
                    dto.getCulturalValoresProducto());

            // 4. GESTIÓN ACADÉMICA ADMINISTRATIVA (FILAS 61 en adelante)
            insertarFila(sheet, 60, "Jurado",
                    s(dto.getGestionJuradoHorasSemana()),
                    s(dto.getGestionJuradoHorasSemestre()),
                    s(dto.getGestionJuradoDescripcion()),
                    dto.getGestionJuradoProducto());

            insertarFila(sheet, 61, "Registros",
                    s(dto.getGestionRegistrosHorasSemana()),
                    s(dto.getGestionRegistrosHorasSemestre()),
                    s(dto.getGestionRegistrosDescripcion()),
                    dto.getGestionRegistrosProducto());

            insertarFila(sheet, 62, "Acreditación",
                    s(dto.getGestionAcreditacionHorasSemana()),
                    s(dto.getGestionAcreditacionHorasSemestre()),
                    s(dto.getGestionAcreditacionDescripcion()),
                    dto.getGestionAcreditacionProducto());

            insertarFila(sheet, 63, "Consejos/Comités",
                    s(dto.getGestionComitesHorasSemana()),
                    s(dto.getGestionComitesHorasSemestre()),
                    s(dto.getGestionComitesDescripcion()),
                    dto.getGestionComitesProducto());

            insertarFila(sheet, 64, "Autoevaluación",
                    s(dto.getGestionAutoevaluacionHorasSemana()),
                    s(dto.getGestionAutoevaluacionHorasSemestre()),
                    s(dto.getGestionAutoevaluacionDescripcion()),
                    dto.getGestionAutoevaluacionProducto());

            insertarFila(sheet, 65, "Investigación de mercado",
                    s(dto.getGestionInvestigacionHorasSemana()),
                    s(dto.getGestionInvestigacionHorasSemestre()),
                    s(dto.getGestionInvestigacionDescripcion()),
                    dto.getGestionInvestigacionProducto());

            insertarFila(sheet, 66, "Formación de profesores",
                    s(dto.getGestionFormacionHorasSemana()),
                    s(dto.getGestionFormacionHorasSemestre()),
                    s(dto.getGestionFormacionDescripcion()),
                    dto.getGestionFormacionProducto());

            insertarFila(sheet, 67, "Prácticas extramuros",
                    s(dto.getGestionPracticasHorasSemana()),
                    s(dto.getGestionPracticasHorasSemestre()),
                    s(dto.getGestionPracticasDescripcion()),
                    dto.getGestionPracticasProducto());

            insertarFila(sheet, 68, "C.TEI",
                    s(dto.getGestionCHHorasSemana()),
                    s(dto.getGestionCHHorasSemestre()),
                    s(dto.getGestionCHDescripcion()),
                    dto.getGestionCHProducto());

            insertarFila(sheet, 69, "Liderazgo en resultados de aprendizaje",
                    s(dto.getGestionLiderHorasSemana()),
                    s(dto.getGestionLiderHorasSemestre()),
                    s(dto.getGestionLiderDescripcion()),
                    dto.getGestionLiderProducto());

            workbook.write(out);
            return out.toByteArray();
        }
    }

    private void insertarFila(Sheet sheet, int rowIndex, String actividad, String horasSemana, String horasSemestre,
            String descripcion, String producto) {
        Row row = sheet.getRow(rowIndex);
        if (row == null)
            row = sheet.createRow(rowIndex);

        Cell cellActividad = row.getCell(0); // A
        if (cellActividad == null)
            cellActividad = row.createCell(0);
        cellActividad.setCellValue(actividad);

        Cell cellHorasSemana = row.getCell(3); // D
        if (cellHorasSemana == null)
            cellHorasSemana = row.createCell(3);
        cellHorasSemana.setCellValue(horasSemana);

        Cell cellHorasSemestre = row.getCell(4); // E
        if (cellHorasSemestre == null)
            cellHorasSemestre = row.createCell(4);
        cellHorasSemestre.setCellValue(horasSemestre);

        Cell cellDescripcion = row.getCell(5); // F
        if (cellDescripcion == null)
            cellDescripcion = row.createCell(5);
        cellDescripcion.setCellValue(descripcion);

        Cell cellProducto = row.getCell(7); // H
        if (cellProducto == null)
            cellProducto = row.createCell(7);
        cellProducto.setCellValue(producto);
    }

    private void insertarFilaCientifica(Sheet sheet, int rowIndex, String descripcion,
            String horasSemana, String horasSemestre,
            String detalle, String producto) {
        Row row = sheet.getRow(rowIndex);
        if (row == null)
            row = sheet.createRow(rowIndex);

        if (row.getCell(0) == null)
            row.createCell(0);
        row.getCell(0).setCellValue(descripcion); // A

        if (row.getCell(3) == null)
            row.createCell(3);
        row.getCell(3).setCellValue(horasSemana); // D

        if (row.getCell(4) == null)
            row.createCell(4);
        row.getCell(4).setCellValue(horasSemestre); // E

        if (row.getCell(5) == null)
            row.createCell(5);
        row.getCell(5).setCellValue(detalle); // F

        if (row.getCell(7) == null)
            row.createCell(7);
        row.getCell(7).setCellValue(producto); // H
    }

    private String s(Object o) {
        return o == null ? "" : o.toString();
    }
}
