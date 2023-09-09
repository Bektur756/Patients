<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>schedule</title>
    <style>
      table {
        border-collapse: collapse;
        width: 100%;
      }
      th, td {
        text-align: center;
        padding: 10px;
      }
      th {
        background-color: #f2f2f2;
      }
      td {
        border: 1px solid #ccc;
      }
    </style>
</head>

<body>
<h1>Schedule</h1>
<table>
    <tr>
    <th>Days</th>
    <th colspan="6">Patients</th>
    </tr>
    <#list calendar as dayMap>
      <tr>
        <#list dayMap?keys as day>
          <td>${day}</td>
        </#list>
        <#assign emptyCells = 7 - dayMap?size>
        <#if emptyCells gt 0>
          <#list 1..emptyCells as _>
            <td></td>
          </#list>
        </#if>
      </tr>
    </#list>

</table>
</body>
</html>
