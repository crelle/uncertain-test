package crelle.test.java.io.serializable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author:crelle
 * @className:SerializableTest1
 * @version:1.0.0
 * @date:2020/9/18
 * @description:特殊处理的序列化和反序列化类要ObjectInputStream和ObjectOutputStream在实现一下特殊的方法
 **/
public class SerializableTest1 implements Serializable {

    //Classes that require special handling during the serialization and deserialization process
    // must implement special methods with these exact signatures:
    private void writeObject(java.io.ObjectOutputStream out)throws IOException{

    }
    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException{

    }
    private void readObjectNoData() throws ObjectStreamException{

    }



}
