package script

import com.sap.gateway.ip.core.customdev.util.Message

def Message processData(Message message) {
    throw new Exception("File validation failed: The input file is empty.")
}