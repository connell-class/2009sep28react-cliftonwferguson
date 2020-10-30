

function renderTable(reimbursements) {
    for (const reimbursement of reimbursements) {
        const tr = document.createElement("tr");
        const reimbId = document.createElement("td");
        const reimbAmount = document.createElement("td");
        const reimbSubmit = document.createElement("td");
        const reimbResolved = document.createElement("td");
        const reimbDesc = document.createElement("td");
        const reimbReceipt = document.createElement("td");
        const reimAuth = document.createElement("td");
        const reimResolver = document.createElement("td");
        const reimStatus = document.createElement("td");
        const reimType = document.createElement("td");
        reimbId.innerText = reimbursement.id;
        reimbAmount.innerHTML = reimbursement.amount;
        reimbSubmit.innerHTML = reimbursement.submitted;
        reimbResolved.innerHTML = reimbursement.resolved;
        reimbDesc.innerHTML = reimbursement.description;
        reimbReceipt.innerHTML = reimbursement.receipt;
        reimAuth.innerHTML = reimbSubmit.author_id;
        reimResolver.innerHTML = reimbursement.resolver_id;
        reimStatus.innerHTML = reimbursement.status_id;
        reimType.innerHTML = reimbursement.type_id;
        tr.append(reimbId, reimbAmount, reimbSubmit, reimbResolved, reimbDesc, reimbReceipt, reimAuth,
            reimResolver, reimStatus, reimType);
        document.getElementById("ReimbursementsTableBody").append(tr);
    }
}
async function asyncFetch(url, expression) {
    const response = await fetch(url);
    const json = await response.json();
    expression(json);
}
asyncFetch(
    "http://localhost:8080/Reimbursement/all.json",
    renderTable
)

