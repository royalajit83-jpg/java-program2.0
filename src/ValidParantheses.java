public class ValidParantheses {
    public static void main(String[] args) {
        String paranthesis = "{[]}";
        System.out.println(isValid(paranthesis));
    }

    public static boolean isValid(String str){
        while (true){
            if (str.contains("{}")){
                str = str.replace("{}","");
            } else if (str.contains("()")) {
                str = str.replace("()","");

            }else if (str.contains("[]")){
                str = str.replace("[]","");

            }else{
                return str.isEmpty();
            }
        }
    }
}
