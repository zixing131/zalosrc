package p361nb;

import android.text.TextUtils;
import gm0.AbstractC19509c;
import ho0.AbstractC20110a;
import java.nio.charset.StandardCharsets;
import me0.AbstractC23127l0;

/* renamed from: nb.m */
/* loaded from: classes3.dex */
public abstract class AbstractC23656m extends C23669z {
    public AbstractC23656m(int i11, int i12) {
        this.f114654a = i11;
        this.f114658e = i12;
        this.f114659f = new String[i12];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p361nb.C23669z
    /* renamed from: a */
    public String mo123972a(int i11, String str) {
        try {
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] m118630a = AbstractC23127l0.m118630a(AbstractC19509c.m101978a(str), "c0m.z1ng.z410.salt".getBytes());
        if (m118630a != null) {
            return new String(m118630a, StandardCharsets.UTF_8);
        }
        return super.mo123972a(i11, str);
    }

    /* renamed from: g */
    public void m123973g(int i11, String str) {
        if (i11 >= this.f114658e) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f114659f[i11] = "";
            return;
        }
        try {
            byte[] m118631b = AbstractC23127l0.m118631b(str.getBytes(StandardCharsets.UTF_8), "c0m.z1ng.z410.salt".getBytes());
            if (m118631b != null) {
                this.f114659f[i11] = AbstractC19509c.m101979b(m118631b);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
