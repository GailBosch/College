Table table;

void setup() {

  table = loadTable("flights2k(1).csv", "header");

  println(table.getRowCount() + " total rows in table");

  for (TableRow row : table.rows()) {

    int id = row.getInt("DEST");
    String species = row.getString("ORIGIN");
    String name = row.getString("DEST_CITY_NAME");

    println(name + " (" + species + ") has an ID of " + id);
  }
}

// Sketch prints:
// 3 total rows in table
// Goat (Capra hircus) has an ID of 0
// Leopard (Panthera pardus) has an ID of 1
// Zebra (Equus zebra) has an ID of 2
