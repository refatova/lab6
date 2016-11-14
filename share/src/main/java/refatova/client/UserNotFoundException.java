package refatova.client;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;

/**
 * Created by Saniye on 28.09.16.
 */
public class UserNotFoundException extends RuntimeException implements IsSerializable {

    public UserNotFoundException() {
    }
}
