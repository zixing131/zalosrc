package p361nb;

import android.text.TextUtils;
import com.zing.zalo.utils.cryptology.Utils;
import com.zing.zalocore.connection.socket.AbstractC17527f;
import gm0.AbstractC19509c;
import java.nio.charset.Charset;

/* renamed from: nb.l */
/* loaded from: classes3.dex */
public class C23655l extends C23669z {

    /* renamed from: i */
    public String f114601i;

    public C23655l() {
        this.f114658e = 1;
        this.f114659f = new String[1];
        this.f114601i = "";
        this.f114654a = 1;
    }

    @Override // p361nb.C23669z
    /* renamed from: c */
    public void mo123889c() {
        if (this.f114658e > 0) {
            this.f114601i = this.f114659f[0];
        }
    }

    @Override // p361nb.C23669z
    /* renamed from: d */
    public String mo123915d() {
        if (!TextUtils.isEmpty(this.f114601i)) {
            try {
                this.f114659f[0] = new String(AbstractC17527f.m93445i(AbstractC19509c.m101978a(this.f114601i), Utils.m89297a(2)), "UTF-8");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.f114601i = "";
        }
        return super.mo123915d();
    }

    @Override // p361nb.C23669z
    /* renamed from: f */
    public void mo123890f() {
        if (this.f114658e > 0) {
            if (TextUtils.isEmpty(this.f114601i)) {
                int i11 = this.f114655b;
                if (i11 != 3 && i11 != 2 && i11 != 1 && i11 != 4 && i11 != 5) {
                    this.f114601i = this.f114659f[0];
                } else {
                    Charset forName = Charset.forName("UTF-8");
                    String m101979b = AbstractC19509c.m101979b(AbstractC17527f.m93445i(this.f114659f[0].getBytes(forName), Utils.m89297a(2)));
                    if (!TextUtils.isEmpty(m101979b)) {
                        this.f114601i = m101979b;
                    } else {
                        this.f114601i = "";
                    }
                }
            }
            this.f114659f[0] = this.f114601i;
        }
    }
}
