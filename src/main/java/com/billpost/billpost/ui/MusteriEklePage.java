package com.billpost.billpost.ui;

import com.billpost.billpost.entity.Musteri;
import com.vaadin.data.validator.NullValidator;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.*;

/**
 * MusteriEklePage
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

public class MusteriEklePage extends Window {

    public MusteriEklePage(){
        super("Müşteri Ekle");
        this.center();
        VerticalLayout verticalLayout = new VerticalLayout();
        this.setContent(verticalLayout);
        setModal(true);

        TextField adiTextField = new TextField("Adı");
        adiTextField.setIcon(FontAwesome.USER);
        adiTextField.setRequired(true);
        adiTextField.addValidator(new NullValidator("Zorunludur!", false));

        TextField soyadiTextField = new TextField("Soyadı");
        soyadiTextField.setIcon(FontAwesome.USER);
        soyadiTextField.setRequired(true);
        soyadiTextField.addValidator(new NullValidator("Zorunludur!", false));

        TextField sehirTextField = new TextField("Şehir");
        sehirTextField.setIcon(FontAwesome.ROAD);

        TextField telefonTextField = new TextField("Telefon");
        telefonTextField.setIcon(FontAwesome.PHONE);
        telefonTextField.setRequired(true);
        telefonTextField.addValidator(new NullValidator("Zorunludur!", false));

        verticalLayout.addComponents(adiTextField, soyadiTextField, sehirTextField, telefonTextField);

        Button tamam = new Button("Kaydet");
        verticalLayout.addComponent(tamam);
        verticalLayout.setComponentAlignment(tamam, Alignment.BOTTOM_RIGHT);
        tamam.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {

                Musteri musteri = new Musteri();
                musteri.setAdi(adiTextField.getValue());
                musteri.setSoyadi(soyadiTextField.getValue());
                musteri.setAdres(sehirTextField.getValue());
                musteri.setTel(telefonTextField.getValue());

//                VeritabaniIslemleri veritabaniIslemleri = new VeritabaniIslemleri();
//                veritabaniIslemleri.addPerson(musteri);
//                Notification.show("Kişi Eklendi");

            }
        });
    }

}
