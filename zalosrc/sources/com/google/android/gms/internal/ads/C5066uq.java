package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* renamed from: com.google.android.gms.internal.ads.uq */
/* loaded from: classes2.dex */
public final class C5066uq {

    /* renamed from: a */
    private final int f29025a;

    /* renamed from: b */
    private final AbstractC4955rq f29026b = new C5141wq();

    public C5066uq(int i11) {
        this.f29025a = i11;
    }

    /* renamed from: a */
    public final String m27041a(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append(((String) arrayList.get(i11)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] split = sb2.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        C5029tq c5029tq = new C5029tq();
        PriorityQueue priorityQueue = new PriorityQueue(this.f29025a, new C4992sq(this));
        for (String str : split) {
            String[] m27333b = AbstractC5103vq.m27333b(str, false);
            if (m27333b.length != 0) {
                AbstractC5215yq.m28294c(m27333b, this.f29025a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                c5029tq.f28469b.write(this.f29026b.mo20225b(((C5178xq) it.next()).f30572b));
            } catch (IOException e11) {
                yk0.zzh("Error while writing hash to byteStream", e11);
            }
        }
        return c5029tq.toString();
    }
}
