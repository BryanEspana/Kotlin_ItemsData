class ItemData(val originalValue: Any?) {


    //------------Funciones-----------
    //GetType
    fun getType(): String? {
        when (originalValue){
            String -> return "cadena"
            Int -> return "entero"
            Boolean -> return "booleano"
            else -> return null
        }
        return null
    }

    //GetInfo
    fun getInfo(): String?{

        when (originalValue){
            is String -> {
                val len = originalValue.length
                return "L$len"
            }
            is Int -> {
                if (originalValue%10 == 0){
                    return "M10"
                }else if (originalValue%5 == 0){
                    return "M5"
                }else if (originalValue%2 == 0){
                    return "M2"
                }else{
                    return null;
                }
            }
            is Boolean -> {
                if(originalValue == true){
                    return "Verdadero"
                }else if (originalValue == false){
                    return "Falso"
                }
            }
            else -> return null
        }
        return null
    }

}