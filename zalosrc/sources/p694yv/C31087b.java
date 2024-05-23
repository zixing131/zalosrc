package p694yv;

import com.zing.zalo.mediapipe.faceeffect.data.ModelMetadata;
import p173fz.C19172a;
import p659xv.C30207e;
import p659xv.C30212k;

/* renamed from: yv.b */
/* loaded from: classes.dex */
public final class C31087b implements InterfaceC31086a {

    /* renamed from: a */
    public static final C31087b f143289a = new C31087b();

    /* renamed from: b */
    private static final String f143290b = "mediapipe@faceeffect";

    private C31087b() {
    }

    @Override // p694yv.InterfaceC31086a
    /* renamed from: a */
    public boolean mo151065a() {
        int m100600k = C19172a.m100600k(f143290b + "@enable", 0);
        if ((m100600k != 0 && m100600k != 1) || m100600k != 1) {
            return false;
        }
        return true;
    }

    @Override // p694yv.InterfaceC31086a
    /* renamed from: b */
    public ModelMetadata mo151066b() {
        String str = f143290b + "@model_metadata";
        int m100600k = C19172a.m100600k(str + "@version", 0);
        String m100607r = C19172a.m100607r(str + "@url", "");
        String m100607r2 = C19172a.m100607r(str + "@checksum_zip", "");
        String m100607r3 = C19172a.m100607r(str + "@checksum_folder", "");
        if (m100600k != 0 && m100607r.length() > 0 && m100607r2.length() > 0 && m100607r3.length() > 0) {
            return new ModelMetadata(m100600k, m100607r, m100607r2, m100607r3);
        }
        return null;
    }

    @Override // p694yv.InterfaceC31086a
    /* renamed from: c */
    public C30212k mo151067c() {
        String str = f143290b + "@minimum_requirement@android";
        int i11 = 24;
        int m100600k = C19172a.m100600k(str + "@api_level", 24);
        if (m100600k > 0) {
            i11 = m100600k;
        }
        int m100600k2 = C19172a.m100600k(str + "@opengl_es", 196609);
        int i12 = 4;
        int m100600k3 = C19172a.m100600k(str + "@device_tier", 4);
        if (m100600k3 <= 6 && m100600k3 >= 1) {
            i12 = m100600k3;
        }
        C30207e c30207e = new C30207e(m100600k2);
        if (c30207e.m148980c() > 0 && c30207e.m148981d() >= 0) {
            return new C30212k(i11, c30207e, i12);
        }
        new C30212k(i11, new C30207e(196609), i12);
        return null;
    }
}
