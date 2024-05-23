package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3024q;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.UpdateUserInfoBioView;
import is.AbstractC20826v0;
import me0.AbstractC23170p;
import me0.C23212s8;
import me0.C23278z2;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p615wn.C29106b;
import p716zh.C31845ac;

/* loaded from: classes4.dex */
public class FeedItemBiography extends FeedItemBase {

    /* renamed from: r0 */
    AspectRatioImageView f44337r0;

    /* renamed from: s0 */
    AspectRatioImageView f44338s0;

    /* renamed from: t0 */
    RobotoTextView f44339t0;

    /* renamed from: com.zing.zalo.feed.components.FeedItemBiography$a */
    /* loaded from: classes4.dex */
    public class C8086a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f44340l1;

        C8086a(String str) {
            this.f44340l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                if (interfaceC3968a != null && this.f44340l1.equals(str) && (interfaceC3968a instanceof AspectRatioImageView)) {
                    ((AspectRatioImageView) interfaceC3968a).setShowLoading(false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public FeedItemBiography(Context context) {
        super(context);
    }

    /* renamed from: Q */
    public /* synthetic */ void m43709Q(String str, int i11, int i12) {
        if (this.f44339t0 != null && !TextUtils.isEmpty(str)) {
            this.f44339t0.setText(str);
        }
    }

    /* renamed from: R */
    public /* synthetic */ void m43710R(String str, int i11, int i12) {
        if (this.f44339t0 != null && !TextUtils.isEmpty(str)) {
            if (AbstractC20826v0.m108808f0(i12)) {
                str = str + "…";
            }
            this.f44339t0.setText(str);
        }
    }

    private int getMaxCharsBioByMode() {
        int i11 = this.f44296f0;
        if (i11 == 4) {
            return Integer.MAX_VALUE;
        }
        if (i11 != 0 && i11 != 1) {
            return UpdateUserInfoBioView.f78893c1;
        }
        return 125;
    }

    private int getMaxLinesBioByMode() {
        return this.f44296f0 == 4 ? Integer.MAX_VALUE : 5;
    }

    /* renamed from: S */
    public void m43711S(C3000l0 c3000l0, int i11, boolean z11) {
        String str;
        int i12;
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            String str2 = "";
            if (this.f44296f0 == 2) {
                C3024q c3024q = m14324b0.f12023C.f12099H;
                if (c3024q != null) {
                    str2 = c3024q.f12091c;
                }
                AbstractC20826v0.m108811h(str2, -1, UpdateUserInfoBioView.f78893c1, 5, new AbstractC20826v0.i() { // from class: com.zing.zalo.feed.components.x0
                    public /* synthetic */ C8429x0() {
                    }

                    @Override // is.AbstractC20826v0.i
                    /* renamed from: a */
                    public final void mo44661a(String str3, int i13, int i14) {
                        FeedItemBiography.this.m43709Q(str3, i13, i14);
                    }
                });
                return;
            }
            this.f44337r0.setImageDrawable(AbstractC23170p.m119358p(getContext()));
            boolean z12 = AbstractC23304d.m120536g().f147980a;
            C24003n m120106Y = C23278z2.m120106Y();
            C3024q c3024q2 = m14324b0.f12023C.f12099H;
            if (c3024q2 == null) {
                str = "";
            } else {
                str = c3024q2.f12090b;
            }
            if (C23999j.m125696L2(str, m120106Y)) {
                ((C23528a) this.f44295e0.m123612r(this.f44337r0)).m123619y(str, m120106Y, 10);
                this.f44337r0.setShowLoading(false);
            } else {
                boolean z13 = true;
                if (z11 && z12) {
                    AspectRatioImageView aspectRatioImageView = this.f44337r0;
                    if (this.f44296f0 == 2) {
                        z13 = false;
                    }
                    aspectRatioImageView.setShowLoading(z13);
                } else {
                    AspectRatioImageView aspectRatioImageView2 = this.f44337r0;
                    if (this.f44296f0 == 2) {
                        z13 = false;
                    }
                    aspectRatioImageView2.setShowLoading(z13);
                    ((C23528a) this.f44295e0.m123612r(this.f44337r0)).m123579C(str, m120106Y, new C8086a(str));
                }
            }
            C3024q c3024q3 = m14324b0.f12023C.f12099H;
            if (c3024q3 != null) {
                i12 = c3024q3.f12089a;
            } else {
                i12 = AbstractC23304d.f113332T2[0];
            }
            AspectRatioImageView aspectRatioImageView3 = this.f44338s0;
            if (aspectRatioImageView3 != null) {
                aspectRatioImageView3.setBackgroundColor(i12);
            }
            C31845ac.m152996J().m153074y0(this.f44339t0, C31845ac.m152996J().m153020A(), false);
            C3024q c3024q4 = m14324b0.f12023C.f12099H;
            if (c3024q4 != null) {
                str2 = c3024q4.f12091c;
            }
            AbstractC20826v0.m108811h(str2, -1, getMaxCharsBioByMode(), getMaxLinesBioByMode(), new AbstractC20826v0.i() { // from class: com.zing.zalo.feed.components.y0
                public /* synthetic */ C8437y0() {
                }

                @Override // is.AbstractC20826v0.i
                /* renamed from: a */
                public final void mo44661a(String str3, int i13, int i14) {
                    FeedItemBiography.this.m43710R(str3, i13, i14);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: j */
    public void mo43686j(C29106b c29106b) {
        setFeedContent(c29106b.f134937a);
        mo43681A(c29106b.f134937a, 0, c29106b.f134940d, c29106b.f134942f);
        m43682E(c29106b.f134937a, 0, c29106b.f134939c, c29106b.f134941e, c29106b.f134942f, true, c29106b.f134943g);
        m43711S(c29106b.f134937a, 0, c29106b.f134940d);
        m43687l();
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: p */
    public void mo43688p(Context context, int i11) {
        this.f44296f0 = i11;
        try {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            if (i11 == 0) {
                layoutInflater.inflate(AbstractC7409c0.feed_item_biography_content, this);
            } else if (i11 == 4) {
                layoutInflater.inflate(AbstractC7409c0.feed_item_biography_content_detail, this);
            } else if (i11 == 1) {
                layoutInflater.inflate(AbstractC7409c0.feed_item_biography_content_group, this);
            } else if (i11 == 2) {
                setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.ProfilePrimaryBackgroundColor));
                layoutInflater.inflate(AbstractC7409c0.feed_item_biography_content_profile, this);
            }
            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) findViewById(AbstractC6918a0.imv_photo);
            this.f44337r0 = aspectRatioImageView;
            if (aspectRatioImageView != null) {
                aspectRatioImageView.setScaleOption(1);
            }
            AspectRatioImageView aspectRatioImageView2 = (AspectRatioImageView) findViewById(AbstractC6918a0.overlay_bio);
            this.f44338s0 = aspectRatioImageView2;
            if (aspectRatioImageView2 != null) {
                aspectRatioImageView2.setScaleOption(1);
            }
            this.f44339t0 = (RobotoTextView) findViewById(AbstractC6918a0.tv_bio);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo43688p(context, i11);
    }

    public FeedItemBiography(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
