const g = (a,b) => {
    const r = b%a;
    if(r === 0) return a;
    return g(r, a);
}
const rp = (a,b)=>{
    if(a>b){
        const t = a;
        a = b;
        b = t;
    }
    return g(a,b) === 1;
}
(()=>{
    const a = parseInt(prompt("Enter the first value: "));
    const b = parseInt(prompt("Enter the second value: "));
    console.log(`The numbers ${a} and ${b} are ${rp(a,b)?"":"not"} relatively prime`);
    alert(`The numbers ${a} and ${b} are ${rp(a,b)?"":"not"} relatively prime`);
})();