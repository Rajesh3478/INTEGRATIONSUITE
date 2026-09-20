import com.sap.it.api.mapping.*;

def String resBoolean(String input) {
    if (input == "1") {
        return "true"
    } else if (input == "" || input == "0") {
        return "false"
    }
    
    return input
}
