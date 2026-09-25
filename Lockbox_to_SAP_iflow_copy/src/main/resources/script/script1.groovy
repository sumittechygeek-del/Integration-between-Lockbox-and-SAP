package script

import com.sap.gateway.ip.core.customdev.util.Message;

def Message processData(Message message) {

    long size = message.getBodySize()
    if (size < 0) {
        throw new IllegalStateException("Cannot determine SAP payment file size")
    }
    message.setProperty("fileSize", size)
    
    return message;
}