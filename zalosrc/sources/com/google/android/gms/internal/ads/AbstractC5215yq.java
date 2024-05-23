package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

/* renamed from: com.google.android.gms.internal.ads.yq */
/* loaded from: classes2.dex */
public abstract class AbstractC5215yq {
    /* renamed from: a */
    static long m28292a(long j11, int i11) {
        if (i11 == 1) {
            return j11;
        }
        return ((i11 & 1) == 0 ? m28292a((j11 * j11) % 1073807359, i11 >> 1) : j11 * (m28292a((j11 * j11) % 1073807359, i11 >> 1) % 1073807359)) % 1073807359;
    }

    /* renamed from: b */
    static String m28293b(String[] strArr, int i11, int i12) {
        int i13 = i12 + i11;
        if (strArr.length < i13) {
            yk0.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i14 = i13 - 1;
            if (i11 < i14) {
                sb2.append(strArr[i11]);
                sb2.append(' ');
                i11++;
            } else {
                sb2.append(strArr[i14]);
                return sb2.toString();
            }
        }
    }

    /* renamed from: c */
    public static void m28294c(String[] strArr, int i11, int i12, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            m28295d(i11, m28296e(strArr, 0, length), m28293b(strArr, 0, length), length, priorityQueue);
            return;
        }
        long m28296e = m28296e(strArr, 0, 6);
        m28295d(i11, m28296e, m28293b(strArr, 0, 6), 6, priorityQueue);
        long m28292a = m28292a(16785407L, 5);
        int i13 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i13 < length2 - 5) {
                m28296e = ((((((m28296e + 1073807359) - ((((AbstractC5103vq.m27332a(strArr[i13 - 1]) + 2147483647L) % 1073807359) * m28292a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((AbstractC5103vq.m27332a(strArr[i13 + 5]) + 2147483647L) % 1073807359)) % 1073807359;
                m28295d(i11, m28296e, m28293b(strArr, i13, 6), length2, priorityQueue);
                i13++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    static void m28295d(int i11, long j11, String str, int i12, PriorityQueue priorityQueue) {
        C5178xq c5178xq = new C5178xq(j11, str, i12);
        if ((priorityQueue.size() == i11 && (((C5178xq) priorityQueue.peek()).f30573c > c5178xq.f30573c || ((C5178xq) priorityQueue.peek()).f30571a > c5178xq.f30571a)) || priorityQueue.contains(c5178xq)) {
            return;
        }
        priorityQueue.add(c5178xq);
        if (priorityQueue.size() > i11) {
            priorityQueue.poll();
        }
    }

    /* renamed from: e */
    private static long m28296e(String[] strArr, int i11, int i12) {
        long m27332a = (AbstractC5103vq.m27332a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i13 = 1; i13 < i12; i13++) {
            m27332a = (((m27332a * 16785407) % 1073807359) + ((AbstractC5103vq.m27332a(strArr[i13]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return m27332a;
    }
}
