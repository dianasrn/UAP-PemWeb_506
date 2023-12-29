<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator Hasrga Barang</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 50px;
        }

        #result {
            font-weight: bold;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <h2>Calculator Harga Barang</h2>

    <from id="calculatorFrom">
        <label for="namaBarang">Nama Barang:</label>
        <input type="text" id="namaBarang" required><br>

        <label for="hargaBarang">Harga Barang (per item):</label>
        <input type="number" id="hargaBarang" min="0" step="0.01" required><br>

        <label for="jumlahBarang">Jumlah Barang:</label>
        <input type="number" id="jumlahBarang" min="0" required><br>

        <button type="button" onclick="hitungTotal()">Hitung Total Harga</button>
    </form>

    <div id="result"></div>

    <script>
       function hitungTotal() {
            var namaBarang = document.getElementById("namaBarang").value;
            var hargaBarang = parseFloat(document.getElementById("hargaBarang").value);
            var jumlahBarang = parseInt(document.getElementById("jumlahBarang").value);

            var totalHarga = hargaBarang * jumlahBarang;

            var resultDiv = document.getElementById("result");
            resultDiv.innerHTML = "Total harga untuk " + jumlahBarang + " " + namaBarang + " adalah: $" + totalHarga.toFixed(2);
        }
    </script>
<body>
<html>
