package p460qt;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.androidquery.util.AbstractC3974g;
import et.C18607n;
import ho0.AbstractC20110a;
import java.io.InputStream;
import me0.C23257x1;
import p239ih.C20556f;
import p643xf.C29617j;

/* renamed from: qt.a */
/* loaded from: classes4.dex */
public class C25491a extends AbstractC25492b {

    /* renamed from: w */
    final C20556f f122114w;

    /* renamed from: x */
    final C29617j.a f122115x;

    /* renamed from: y */
    final a f122116y;

    /* renamed from: qt.a$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo94522a(Bitmap bitmap, C29617j.a aVar);
    }

    public C25491a(C18607n c18607n, int i11, int i12, C20556f c20556f, C29617j.a aVar, a aVar2) {
        super(c18607n, i11, i12);
        this.f122114w = c20556f;
        this.f122115x = aVar;
        this.f122116y = aVar2;
    }

    @Override // p460qt.AbstractC25492b
    /* renamed from: g */
    protected Bitmap mo132064g(BitmapFactory.Options options) {
        String str;
        if (!TextUtils.isEmpty(this.f122114w.m106842o())) {
            str = this.f122114w.m106842o();
        } else {
            str = "";
        }
        String str2 = str;
        if (options.inJustDecodeBounds) {
            BitmapFactory.Options m18820a = AbstractC3974g.f15714a.m18820a(str2);
            options.outWidth = m18820a.outWidth;
            options.outHeight = m18820a.outHeight;
            return null;
        }
        InputStream m106838k = this.f122114w.m106838k();
        try {
            if (m106838k == null) {
                if (m106838k != null) {
                    try {
                        m106838k.close();
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                }
                return null;
            }
            try {
                Bitmap m18821b = AbstractC3974g.f15714a.m18821b(str2, m106838k, options, this.f122120u, this.f122121v);
                try {
                    m106838k.close();
                } catch (Exception e12) {
                    AbstractC20110a.m104539h(e12);
                }
                return m18821b;
            } catch (Exception e13) {
                AbstractC20110a.m104539h(e13);
                try {
                    m106838k.close();
                } catch (Exception e14) {
                    AbstractC20110a.m104539h(e14);
                }
                return null;
            }
        } catch (Throwable th2) {
            try {
                m106838k.close();
            } catch (Exception e15) {
                AbstractC20110a.m104539h(e15);
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // p460qt.AbstractC25492b
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected int mo132065i() {
        int i11;
        C23257x1 m106833e;
        try {
            m106833e = this.f122114w.m106833e();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (m106833e != null) {
            i11 = m106833e.m119907h("Orientation", 1);
            if (i11 == 3) {
                if (i11 != 6) {
                    if (i11 != 8) {
                        return 0;
                    }
                    return 270;
                }
                return 90;
            }
            return 180;
        }
        i11 = 0;
        if (i11 == 3) {
        }
    }

    @Override // u30.AbstractRunnableC27007b
    /* renamed from: l */
    public void mo116143d(Bitmap bitmap) {
        super.mo116143d(bitmap);
        a aVar = this.f122116y;
        if (aVar != null) {
            aVar.mo94522a(bitmap, this.f122115x);
        }
    }
}
