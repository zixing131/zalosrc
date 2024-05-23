package p361nb;

import java.util.ArrayList;

/* renamed from: nb.v */
/* loaded from: classes3.dex */
public class C23665v extends C23669z {

    /* renamed from: i */
    public long f114640i;

    /* renamed from: j */
    public int f114641j;

    /* renamed from: k */
    public int f114642k;

    /* renamed from: l */
    public long f114643l;

    public C23665v() {
        this.f114640i = 0L;
        this.f114643l = 0L;
        this.f114654a = 0;
        this.f114658e = 4;
        this.f114659f = new String[4];
    }

    /* renamed from: g */
    public static String m123989g(C23665v c23665v, ArrayList arrayList) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        try {
            if (c23665v != null) {
                sb2.append(c23665v.f114654a);
                sb2.append(",");
                sb2.append(c23665v.f114640i);
                sb2.append(",");
                sb2.append(c23665v.f114641j);
                sb2.append(",");
                sb2.append(c23665v.f114642k);
                sb2.append(",");
                sb2.append(c23665v.f114657d);
                sb2.append(",");
                sb2.append(c23665v.f114643l);
                sb2.append(",");
                sb2.append(c23665v.f114656c);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    C23665v c23665v2 = (C23665v) arrayList.get(i11);
                    if (c23665v2 != null) {
                        sb2.append(c23665v2.f114654a);
                        sb2.append(",");
                        sb2.append(c23665v2.f114640i);
                        sb2.append(",");
                        sb2.append(c23665v2.f114641j);
                        sb2.append(",");
                        sb2.append(c23665v2.f114642k);
                        sb2.append(",");
                        sb2.append(c23665v2.f114657d);
                        sb2.append(",");
                        sb2.append(c23665v2.f114643l);
                        sb2.append(",");
                        sb2.append(c23665v2.f114656c);
                    }
                    if (i11 != arrayList.size() - 1) {
                        sb2.append(";");
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("TimeOnAppInfo gen exe: ");
        sb3.append(System.currentTimeMillis() - currentTimeMillis);
        return sb2.toString();
    }

    @Override // p361nb.C23669z
    /* renamed from: c */
    public void mo123889c() {
        super.mo123889c();
        this.f114640i = 0L;
        this.f114641j = 0;
        this.f114642k = 0;
        this.f114643l = 0L;
        this.f114640i = Long.parseLong(this.f114659f[0]);
        this.f114641j = Integer.parseInt(this.f114659f[1]);
        this.f114642k = Integer.parseInt(this.f114659f[2]);
        this.f114643l = Long.parseLong(this.f114659f[3]);
    }

    @Override // p361nb.C23669z
    /* renamed from: f */
    public void mo123890f() {
        super.mo123890f();
        String[] strArr = new String[this.f114658e];
        this.f114659f = strArr;
        strArr[0] = String.valueOf(this.f114640i);
        this.f114659f[1] = String.valueOf(this.f114641j);
        this.f114659f[2] = String.valueOf(this.f114642k);
        this.f114659f[3] = String.valueOf(this.f114643l);
    }

    @Override // p361nb.C23669z
    public String toString() {
        return this.f114654a + "," + this.f114640i + "," + this.f114641j + "," + this.f114642k + "," + this.f114657d + "," + this.f114643l + "," + this.f114656c;
    }

    public C23665v(int i11, long j11, int i12, int i13, String str, long j12, long j13) {
        this.f114643l = 0L;
        this.f114654a = i11;
        this.f114640i = j11;
        this.f114641j = i12;
        this.f114642k = i13;
        this.f114657d = Integer.parseInt(str);
        this.f114643l = j12;
        this.f114656c = j13;
        this.f114658e = 4;
        this.f114659f = new String[4];
    }

    public C23665v(int i11, long j11, int i12, int i13, int i14, long j12, long j13) {
        this.f114654a = i11;
        this.f114640i = j11;
        this.f114641j = i12;
        this.f114642k = i13;
        this.f114657d = i14;
        this.f114643l = j12;
        this.f114656c = j13;
        this.f114658e = 4;
        this.f114659f = new String[4];
    }
}
