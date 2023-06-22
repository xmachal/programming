
public class DatabaseConnector {
    private static final String DB_URL = "jdbc:mysql://localhost:8081/cinema";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "123K;

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Εγκαθιδρύουμε τη σύνδεση με τη βάση δεδομένων
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            // Δημιουργούμε ένα statement για την εκτέλεση ερωτημάτων SQL
            statement = connection.createStatement();

            // Παράδειγμα εκτέλεσης ερωτήματος SELECT
            String sqlQuery = "SELECT * FROM user";
            resultSet = statement.executeQuery(sqlQuery);

            // Επεξεργασία των αποτελεσμάτων
            while (resultSet.next()) {
                // Λήψη δεδομένων από το αποτέλεσμα
                String name = resultSet.getString("username");
                // Εκτύπωση των δεδομένων
                System.out.println("Username: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Κλείσιμο των ανοικτών πόρων (αν υπάρχουν)
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
