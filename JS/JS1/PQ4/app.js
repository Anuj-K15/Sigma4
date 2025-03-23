function table(n) {
    for (let i = n; i <= n*10; i+=n){
        console.log(`${n} x ${i-=n} = ${i}`);
    }
}
table(2);