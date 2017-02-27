
package rummikub.client.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for playerStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="playerStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JOINED"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="RETIRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "playerStatus")
@XmlEnum
public enum PlayerStatus {

    JOINED,
    ACTIVE,
    RETIRED;

    public String value() {
        return name();
    }

    public static PlayerStatus fromValue(String v) {
        return valueOf(v);
    }

}
