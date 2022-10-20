package ru.netology.sqr;

public class SQRService {
    public int calculate(int lowerBoundary, int upperBoundary) {
        int matchCount = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i < lowerBoundary) {
                continue;
            }
            if ((i * i >= lowerBoundary) && (i * i <= upperBoundary)) {
                matchCount++;
                continue;
            }
            if (i * i > upperBoundary) {
                break;
            }
        }

        return matchCount;
    }
}
