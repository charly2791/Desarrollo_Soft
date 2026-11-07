package com.techjimmy.service;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.techjimmy.model.TicketReparacion;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

@Service
public class TicketPdfService {

    public ByteArrayInputStream generarComprobanteReparacion(TicketReparacion ticket) {
        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {
            PdfWriter.getInstance(document, out);
            document.open();

            Font fontTitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, BaseColor.BLACK);
            Font fontTexto = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.DARK_GRAY);

            Paragraph titulo = new Paragraph("Tech-Jimmy System - Ticket de Reparación", fontTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);

            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("Número de Ticket: #" + ticket.getIdTicket(), fontTexto));
            document.add(new Paragraph("Marca/Modelo: " + ticket.getMarca() + " " + ticket.getModelo(), fontTexto));
            document.add(new Paragraph("IMEI / Serie: " + ticket.getNumeroSerieImei(), fontTexto));
            document.add(new Paragraph("Falla Reportada: " + ticket.getFallaReportada(), fontTexto));
            document.add(new Paragraph("Estatus: " + ticket.getEstatus(), fontTexto));
            document.add(new Paragraph("Costo Estimado: $" + ticket.getCostoEstimado(), fontTexto));

            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return new ByteArrayInputStream(out.toByteArray());
    }
}