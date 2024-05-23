package l80;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.gifplayer.C8917b;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.ZGifView;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalocore.CoreUtility;
import kd0.AbstractC21695e;
import me0.AbstractC23136l9;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;

/* renamed from: l80.c */
/* loaded from: classes6.dex */
public abstract class AbstractC22125c extends AbstractC21695e {

    /* renamed from: S0 */
    public static final int f108893S0 = AbstractC23136l9.m118742r(220.0f);

    /* renamed from: G0 */
    protected ZGifView f108894G0;

    /* renamed from: H0 */
    private int f108895H0;

    /* renamed from: I0 */
    private int f108896I0;

    /* renamed from: J0 */
    private int f108897J0;

    /* renamed from: K0 */
    private int f108898K0;

    /* renamed from: L0 */
    private int f108899L0;

    /* renamed from: M0 */
    protected int f108900M0;

    /* renamed from: N0 */
    protected int f108901N0;

    /* renamed from: O0 */
    protected String f108902O0;

    /* renamed from: P0 */
    protected String f108903P0;

    /* renamed from: Q0 */
    protected C23528a f108904Q0;

    /* renamed from: R0 */
    boolean f108905R0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l80.c$a */
    /* loaded from: classes6.dex */
    public class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f108906l1;

        a(String str) {
            this.f108906l1 = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC22125c.this.f108894G0.m92344M(false);
            if (str != null && str.equals(this.f108906l1)) {
                AbstractC22125c.this.m115419t1(c3979l);
            }
        }
    }

    public AbstractC22125c(Context context) {
        super(context, new ZGifView(context));
        this.f108895H0 = 0;
        this.f108905R0 = false;
        this.f108894G0 = (ZGifView) m111943i1();
        this.f108904Q0 = new C23528a(context);
        m115412l1(this.f108894G0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ void m115410m1() {
        try {
            this.f108894G0.m92336E();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: k1 */
    public void m115411k1() {
        ZGifView zGifView = this.f108894G0;
        if (zGifView != null) {
            zGifView.m92345N();
            this.f108894G0.m92337F(true);
        }
        this.f108905R0 = false;
    }

    /* renamed from: l1 */
    void m115412l1(ZGifView zGifView) {
        zGifView.setPlayConfig(ZMediaPlayerSettings.getPlayConfig(1));
        zGifView.setForceHideController(true);
        zGifView.setClickable(false);
        m115417r1(1, f108893S0);
    }

    /* renamed from: n1 */
    public void m115413n1() {
        float f11;
        if (!C8917b.m47601f() || this.f108905R0) {
            return;
        }
        this.f108905R0 = true;
        if (TextUtils.isEmpty(this.f108902O0)) {
            m115411k1();
            return;
        }
        m115414o1(this.f108903P0);
        int i11 = this.f108900M0;
        int i12 = this.f108901N0;
        if (i11 * i12 == 0) {
            f11 = 1.0f;
        } else {
            f11 = (i11 * 1.0f) / i12;
        }
        this.f108894G0.m92341J(new C17391z(CoreUtility.f89233i, "", this.f108902O0, "", this.f108903P0, i11, false, 3, f11, 4, null, "GifModule", -1), ZMediaPlayerSettings.getVideoConfig(4));
        AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: l80.b
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22125c.this.m115410m1();
            }
        });
    }

    /* renamed from: o1 */
    public void m115414o1(String str) {
        try {
            RecyclingImageView loadingView = this.f108894G0.getLoadingView();
            if (loadingView != null && !TextUtils.isEmpty(str)) {
                C24003n m120125f = C23278z2.m120125f();
                Drawable drawable = m120125f.f116261b;
                if (drawable != null) {
                    loadingView.setImageDrawable(drawable);
                } else {
                    loadingView.setImageDrawable(AbstractC23136l9.m118665N(loadingView.getContext(), AbstractC17466e.transparent));
                }
                C3979l m125676A2 = C23999j.m125676A2(str, this.f108900M0, m120125f.f116266g);
                if (m125676A2 != null) {
                    m115419t1(m125676A2);
                    return;
                }
                this.f108894G0.m92344M(true);
                ((C23528a) this.f108904Q0.m123612r(loadingView)).m123579C(str, m120125f, new a(str));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p1 */
    public void m115415p1(String str, String str2, int i11, float f11, int i12, int i13, boolean z11) {
        this.f108902O0 = str;
        this.f108903P0 = str2;
        m115416q1(z11);
        m115417r1(1, i11);
        if (i12 > 0 && i13 > 0) {
            m115418s1(i12, i13);
        } else {
            m115418s1(i11, (int) (i11 / f11));
        }
    }

    /* renamed from: q1 */
    public void m115416q1(boolean z11) {
        this.f108894G0.setRoundCorner(z11);
    }

    /* renamed from: r1 */
    public void m115417r1(int i11, int i12) {
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Invalid scale type");
        }
        int i13 = this.f108895H0;
        if (i13 == i11 && ((i13 != 1 || this.f108896I0 == i12) && (i13 != 2 || this.f108897J0 == i12))) {
            return;
        }
        this.f108895H0 = i11;
        if (i11 != 1) {
            if (i11 != 2) {
                this.f108896I0 = i12;
                this.f108898K0 = (int) (i12 / 1.5d);
                this.f108899L0 = (int) (i12 * 0.25d);
                this.f108897J0 = (int) (i12 * 1.3333333730697632d);
                return;
            }
            this.f108897J0 = i12;
            this.f108899L0 = i12;
            int i14 = (int) (i12 / 1.3333333730697632d);
            this.f108896I0 = i14;
            this.f108898K0 = (int) (i14 / 1.5d);
            return;
        }
        this.f108896I0 = i12;
        this.f108898K0 = i12;
        this.f108899L0 = (int) (i12 * 0.25d);
        this.f108897J0 = (int) (i12 * 1.3333333730697632d);
    }

    /* renamed from: s1 */
    public void m115418s1(int i11, int i12) {
        double d11 = i12;
        double d12 = i11;
        double d13 = d11 / d12;
        if (0.25d <= d13 && d13 <= 1.5d) {
            if (this.f108895H0 == 2) {
                int i13 = this.f108897J0;
                this.f108901N0 = i13;
                this.f108900M0 = (i13 * i11) / i12;
            } else {
                int i14 = this.f108896I0;
                this.f108900M0 = i14;
                int i15 = (i14 * i12) / i11;
                this.f108901N0 = i15;
                int i16 = this.f108897J0;
                if (i15 > i16) {
                    this.f108901N0 = i16;
                    this.f108900M0 = (i16 * i11) / i12;
                }
            }
        } else if (d13 < 0.25d) {
            int i17 = this.f108899L0;
            this.f108901N0 = i17;
            double d14 = i17 / d11;
            this.f108900M0 = Math.min(this.f108896I0, (i17 * ((int) (d12 * d14))) / ((int) (d11 * d14)));
        } else if (this.f108895H0 == 2) {
            int i18 = this.f108899L0;
            this.f108901N0 = i18;
            double d15 = i18 / d11;
            this.f108900M0 = Math.min(this.f108896I0, (i18 * ((int) (d12 * d15))) / ((int) (d11 * d15)));
        } else {
            int i19 = this.f108898K0;
            this.f108900M0 = i19;
            double d16 = i19 / d12;
            this.f108901N0 = Math.min(this.f108897J0, (i19 * ((int) (d11 * d16))) / ((int) (d12 * d16)));
        }
        this.f105344E0 = this.f108900M0;
        this.f105345F0 = this.f108901N0;
        ViewGroup m89119T = m89119T();
        if (m89119T != null) {
            m89119T.requestLayout();
        }
    }

    /* renamed from: t1 */
    public void m115419t1(C3979l c3979l) {
        try {
            RecyclingImageView loadingView = this.f108894G0.getLoadingView();
            if (loadingView != null) {
                loadingView.setVisibility(0);
                loadingView.setImageInfo(c3979l);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
