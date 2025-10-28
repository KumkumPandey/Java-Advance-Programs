int nextPrime(int n) {
    auto isPrime = [](int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    };

    int num = n + 1;
    while (true) {
        if (isPrime(num))
            return num;
        num++;
    }
}

