package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.cr */
/* loaded from: classes2.dex */
public final class C4400cr {

    /* renamed from: a */
    private final AbstractC4955rq f18524a;

    /* renamed from: b */
    private final int f18525b;

    /* renamed from: c */
    private String f18526c;

    /* renamed from: d */
    private final int f18527d;

    public C4400cr(int i11, int i12, int i13) {
        this.f18525b = i11;
        i12 = (i12 > 64 || i12 < 0) ? 64 : i12;
        if (i13 <= 0) {
            this.f18527d = 1;
        } else {
            this.f18527d = i13;
        }
        this.f18524a = new C4327ar(i12);
    }

    /* renamed from: a */
    public final String m20990a(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        Collections.sort(arrayList2, new C4364br(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((C4918qq) arrayList2.get(i11)).m25865e()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str2 : split) {
                    if (str2.contains("'")) {
                        StringBuilder sb2 = new StringBuilder(str2);
                        int i12 = 1;
                        boolean z11 = false;
                        while (true) {
                            int i13 = i12 + 2;
                            if (i13 > sb2.length()) {
                                break;
                            }
                            if (sb2.charAt(i12) == '\'') {
                                if (sb2.charAt(i12 - 1) != ' ') {
                                    int i14 = i12 + 1;
                                    if ((sb2.charAt(i14) == 's' || sb2.charAt(i14) == 'S') && (i13 == sb2.length() || sb2.charAt(i13) == ' ')) {
                                        sb2.insert(i12, ' ');
                                        i12 = i13;
                                        z11 = true;
                                    }
                                }
                                sb2.setCharAt(i12, ' ');
                                z11 = true;
                            }
                            i12++;
                        }
                        if (z11) {
                            str = sb2.toString();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            this.f18526c = str;
                            str2 = str;
                        }
                    }
                    String[] m27333b = AbstractC5103vq.m27333b(str2, true);
                    if (m27333b.length >= this.f18527d) {
                        for (int i15 = 0; i15 < m27333b.length; i15++) {
                            String str3 = "";
                            for (int i16 = 0; i16 < this.f18527d; i16++) {
                                int i17 = i15 + i16;
                                if (i17 >= m27333b.length) {
                                    break;
                                }
                                if (i16 > 0) {
                                    str3 = str3.concat(" ");
                                }
                                str3 = str3.concat(String.valueOf(m27333b[i17]));
                            }
                            hashSet.add(str3);
                            if (hashSet.size() >= this.f18525b) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.f18525b) {
                            break loop0;
                        }
                    }
                }
            }
        }
        C5029tq c5029tq = new C5029tq();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                c5029tq.f28469b.write(this.f18524a.mo20225b((String) it.next()));
            } catch (IOException e11) {
                yk0.zzh("Error while writing hash to byteStream", e11);
            }
        }
        return c5029tq.toString();
    }
}
