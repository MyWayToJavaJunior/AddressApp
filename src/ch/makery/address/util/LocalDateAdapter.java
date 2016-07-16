package ch.makery.address.util;

/**
 * Author: ketaetc (ketaetc@gmail.com)
 * Date: 26.06.16 1:22
 */
import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Адаптер (для JAXB) для преобразования между типом LocalDate и строковым
 * представлением даты в стандарте ISO 8601, например как '2012-12-03'.
 *
 */
public class LocalDateAdapter extends XmlAdapter {

    @Override
    public Object unmarshal(Object v) throws Exception {
        return null;
    }

    @Override
    public Object marshal(Object v) throws Exception {
        return null;
    }
}
