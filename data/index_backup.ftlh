<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>schedule</title>
</head>
<body>
<h1>schedule</h1>
<table>
  <tr>
    <th>Name</th>
    <th>Birth Date</th>
    <th>Type</th>
    <th>Symptoms</th>
  </tr>
  <#list schedule.patients as patient>
  <tr>
    <td>${patient.name}</td>
    <td>${patient.birthDate}</td>
    <td>${patient.type}</td>
    <td>${patient.symptoms}</td>
  </tr>
</#list>
</table>
</body>
</html>
