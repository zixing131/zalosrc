package com.zing.zalo.p077ui.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import au.C2343e;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.custom.DrawableCallbackView;
import com.zing.zalo.p077ui.zviews.ke0;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l30.AbstractC22055v0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import vg.AbstractRunnableC28185s6;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class GroupAvatarView extends DrawableCallbackView implements AbstractRunnableC28185s6.b {

    /* renamed from: A */
    List f69250A;

    /* renamed from: B */
    int f69251B;

    /* renamed from: C */
    int f69252C;

    /* renamed from: D */
    int f69253D;

    /* renamed from: E */
    boolean f69254E;

    /* renamed from: F */
    boolean f69255F;

    /* renamed from: G */
    boolean f69256G;

    /* renamed from: H */
    PathEffect f69257H;

    /* renamed from: I */
    float f69258I;

    /* renamed from: J */
    int f69259J;

    /* renamed from: K */
    int[] f69260K;

    /* renamed from: L */
    int[] f69261L;

    /* renamed from: M */
    int[] f69262M;

    /* renamed from: N */
    RectF f69263N;

    /* renamed from: O */
    Paint f69264O;

    /* renamed from: P */
    int f69265P;

    /* renamed from: Q */
    int f69266Q;

    /* renamed from: R */
    String f69267R;

    /* renamed from: q */
    C23528a f69268q;

    /* renamed from: r */
    C13703p0 f69269r;

    /* renamed from: s */
    C3977j[] f69270s;

    /* renamed from: t */
    Drawable[] f69271t;

    /* renamed from: u */
    C24003n f69272u;

    /* renamed from: v */
    Drawable f69273v;

    /* renamed from: w */
    boolean f69274w;

    /* renamed from: x */
    String f69275x;

    /* renamed from: y */
    String f69276y;

    /* renamed from: z */
    int f69277z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.GroupAvatarView$a */
    /* loaded from: classes6.dex */
    public class C13502a extends AbstractRunnableC28185s6 {

        /* renamed from: z */
        final /* synthetic */ List f69279z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13502a(AbstractRunnableC28185s6.b bVar, List list, int i11, List list2) {
            super(bVar, list, i11);
            this.f69279z = list2;
        }

        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        public void mo61137c(ArrayList arrayList) {
            String str;
            String str2;
            String str3;
            int i11;
            try {
                try {
                    Iterator it = this.f69279z.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        AbstractC3972e.m18783g0(GroupAvatarView.this.f69270s[intValue]);
                        if (intValue < GroupAvatarView.this.f69250A.size()) {
                            ContactProfile m141811g = C28203u6.f131407a.m141811g((String) GroupAvatarView.this.f69250A.get(intValue));
                            if (m141811g != null) {
                                String str4 = m141811g.f42446v;
                                if (TextUtils.isEmpty(str4)) {
                                    str2 = null;
                                    str3 = str4;
                                    str = null;
                                } else {
                                    if (C23302b.f113247a.m120523d(str4) && !CoreUtility.f89233i.equals(m141811g.f42434r)) {
                                        i11 = 3;
                                        str2 = m141811g.m40418n0();
                                        str3 = str4;
                                        str = m141811g.f42434r;
                                    } else {
                                        str2 = null;
                                        str3 = str4;
                                        str = null;
                                        i11 = 2;
                                    }
                                    GroupAvatarView.this.m75735g(i11, str, str2, str3, intValue);
                                }
                            } else {
                                str = null;
                                str2 = null;
                                str3 = null;
                            }
                            i11 = 1;
                            GroupAvatarView.this.m75735g(i11, str, str2, str3, intValue);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                GroupAvatarView.this.postInvalidate();
            } catch (Throwable th2) {
                GroupAvatarView.this.postInvalidate();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.GroupAvatarView$b */
    /* loaded from: classes6.dex */
    public class C13503b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f69280l1;

        /* renamed from: m1 */
        final /* synthetic */ int f69281m1;

        C13503b(String str, int i11) {
            this.f69280l1 = str;
            this.f69281m1 = i11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (TextUtils.equals(str, this.f69280l1)) {
                    if (c3979l == null || c3979l.m18839c() == null || (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1)) {
                        GroupAvatarView groupAvatarView = GroupAvatarView.this;
                        groupAvatarView.f69271t[this.f69281m1] = groupAvatarView.f69273v;
                        GroupAvatarView.this.postInvalidate();
                    }
                    C3977j c3977j = GroupAvatarView.this.f69270s[this.f69281m1];
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    if (c23995f.m125666q() == 4) {
                        GroupAvatarView.this.f69271t[this.f69281m1] = new BitmapDrawable(GroupAvatarView.this.getResources(), c3979l.m18839c());
                    } else {
                        GroupAvatarView.this.f69271t[this.f69281m1] = new TransitionDrawable(new Drawable[]{GroupAvatarView.this.f69272u.f116261b, new BitmapDrawable(GroupAvatarView.this.getResources(), c3979l.m18839c())});
                        GroupAvatarView groupAvatarView2 = GroupAvatarView.this;
                        groupAvatarView2.f69271t[this.f69281m1].setCallback(groupAvatarView2);
                        ((TransitionDrawable) GroupAvatarView.this.f69271t[this.f69281m1]).setCrossFadeEnabled(true);
                        ((TransitionDrawable) GroupAvatarView.this.f69271t[this.f69281m1]).startTransition(1000);
                    }
                    GroupAvatarView.this.postInvalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public GroupAvatarView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    void m75729a() {
        int i11;
        String str;
        String str2;
        String str3;
        String str4;
        try {
            int numOfNeedLoadAvatars = getNumOfNeedLoadAvatars();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < numOfNeedLoadAvatars; i12++) {
                AbstractC3972e.m18783g0(this.f69270s[i12]);
                if (!TextUtils.isEmpty((CharSequence) this.f69250A.get(i12))) {
                    i11 = 3;
                    if (!((String) this.f69250A.get(i12)).startsWith("http") && !((String) this.f69250A.get(i12)).contains(".png") && !((String) this.f69250A.get(i12)).contains(".jpg")) {
                        ContactProfile m141811g = C28203u6.f131407a.m141811g((String) this.f69250A.get(i12));
                        if (m141811g != null) {
                            String str5 = m141811g.f42446v;
                            if (TextUtils.isEmpty(str5)) {
                                str3 = null;
                                str = str5;
                                i11 = 1;
                            } else if (C23302b.f113247a.m120523d(str5) && (str4 = CoreUtility.f89233i) != null && !str4.equals(m141811g.f42434r)) {
                                str3 = m141811g.m40418n0();
                                str = str5;
                                str2 = m141811g.f42434r;
                                m75735g(i11, str2, str3, str, i12);
                            } else {
                                str3 = null;
                                str = str5;
                                i11 = 2;
                            }
                            str2 = str3;
                            m75735g(i11, str2, str3, str, i12);
                        } else {
                            arrayList.add((String) this.f69250A.get(i12));
                            arrayList2.add(Integer.valueOf(i12));
                        }
                    }
                    String str6 = (String) this.f69250A.get(i12);
                    if (C23302b.f113247a.m120523d(str6) && CoreUtility.f89233i != null && !TextUtils.isEmpty(this.f69276y) && !CoreUtility.f89233i.equals(this.f69276y)) {
                        str = str6;
                        str3 = this.f69275x;
                        str2 = this.f69276y;
                    } else {
                        str = str6;
                        str2 = null;
                        str3 = null;
                        i11 = 2;
                    }
                    m75735g(i11, str2, str3, str, i12);
                }
                str2 = null;
                str3 = null;
                str = null;
                i11 = 1;
                m75735g(i11, str2, str3, str, i12);
            }
            invalidate();
            if (arrayList.size() > 0) {
                new C13502a(this, arrayList, 1054, arrayList2).m141750b();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    boolean m75730b() {
        try {
            int numOfNeedLoadAvatars = getNumOfNeedLoadAvatars();
            for (int i11 = 0; i11 < numOfNeedLoadAvatars; i11++) {
                if (this.f69271t[i11] == this.f69273v) {
                    return false;
                }
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    /* renamed from: c */
    public void m75731c(ContactProfile contactProfile) {
        String str;
        try {
            if (contactProfile != null) {
                setScrollingMode(this.f69274w);
                if (contactProfile.m40374K0()) {
                    setImageOption(C23278z2.m120141m0());
                    m75734f(contactProfile.m40388T(false));
                    return;
                }
                if (AbstractC25495a.m132081f(contactProfile.f42434r)) {
                    setImageResource(AbstractC16803z.ava_oa_news);
                    return;
                }
                if (AbstractC25495a.m132087l(contactProfile.f42434r)) {
                    setImageResource(AbstractC23322a.zds_oic_logo_channel_border_88);
                    return;
                }
                if (!TextUtils.isEmpty(contactProfile.f42446v)) {
                    if (C23302b.f113247a.m120523d(contactProfile.f42446v) && (str = CoreUtility.f89233i) != null && !str.equals(contactProfile.f42434r)) {
                        String str2 = contactProfile.f42434r;
                        if (TextUtils.isEmpty(str2) || str2.startsWith("/")) {
                            str2 = ke0.m87327a(contactProfile.f42455y);
                        }
                        setUidForGenColor(str2);
                        setShortDpnAvt(contactProfile.m40418n0());
                        m75732d(contactProfile.f42446v);
                        return;
                    }
                    setImageOption(C23278z2.m120143n());
                    m75732d(contactProfile.f42446v);
                    return;
                }
                setImageDrawable(C23212s8.m119609q(getContext(), AbstractC16781w.default_avatar));
                return;
            }
            m75732d("");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m75732d(String str) {
        this.f69250A.clear();
        this.f69250A.add(str);
        this.f69277z = 1;
        m75729a();
        this.f69269r.m76608h(this.f69277z, null, this.f69271t);
    }

    /* renamed from: e */
    public void m75733e(List list) {
        this.f69250A.clear();
        if (list != null && list.size() != 0) {
            this.f69250A.addAll(list);
        } else {
            this.f69250A.add("");
        }
        this.f69267R = null;
        if (this.f69250A.size() == 2 && ((String) this.f69250A.get(1)).equals("1")) {
            this.f69277z = 5;
            this.f69250A.remove(1);
            this.f69267R = "1";
        } else if (this.f69250A.size() == 4) {
            this.f69277z = 4;
            this.f69267R = null;
        } else if (this.f69250A.size() >= 5) {
            this.f69277z = 4;
            this.f69267R = (String) this.f69250A.get(4);
        } else {
            this.f69277z = this.f69250A.size();
        }
        if (this.f69277z <= 0) {
            this.f69277z = 1;
        }
        m75729a();
        this.f69269r.m76608h(this.f69277z, this.f69267R, this.f69271t);
    }

    /* renamed from: f */
    public void m75734f(C31973j5 c31973j5) {
        if (c31973j5 != null && c31973j5.m153786t0()) {
            m75732d(c31973j5.m153756e());
        } else if (c31973j5 != null && c31973j5.m153762h() != null) {
            m75733e(c31973j5.m153762h());
        } else {
            m75732d("");
        }
    }

    /* renamed from: g */
    void m75735g(int i11, String str, String str2, String str3, int i12) {
        if (i11 == 3 && str != null && str2 != null) {
            this.f69271t[i12] = C16640q2.m88404a().mo88412f(str2, C2343e.m12307a(str, false));
        } else {
            if (i11 == 2) {
                this.f69271t[i12] = this.f69273v;
                if (!this.f69274w || C23999j.m125696L2(str3, this.f69272u)) {
                    ((C23528a) this.f69268q.m123612r(this.f69270s[i12])).m123579C(str3, this.f69272u, new C13503b(str3, i12));
                    return;
                }
                return;
            }
            this.f69271t[i12] = this.f69273v;
        }
    }

    public Bitmap getBitmap() {
        int dimensionPixelSize;
        int i11;
        int i12;
        int color;
        if (getWidth() > 0 && getHeight() > 0) {
            dimensionPixelSize = getWidth();
            i11 = getHeight();
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC16802y.avt_image_size_default);
            i11 = dimensionPixelSize;
        }
        if (dimensionPixelSize > i11) {
            i12 = dimensionPixelSize;
        } else {
            i12 = i11;
        }
        int round = Math.round((float) Math.sqrt((i12 * i12) / 2)) * 2;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, i11, config);
        Canvas canvas = new Canvas(createBitmap);
        if (!m75730b()) {
            createBitmap.recycle();
            return null;
        }
        C13703p0 c13703p0 = this.f69269r;
        if (c13703p0 != null) {
            c13703p0.m76603a(canvas);
        }
        if (this.f69277z > 1) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            paint.setDither(true);
            Bitmap createBitmap2 = Bitmap.createBitmap(round, round, config);
            Canvas canvas2 = new Canvas(createBitmap2);
            Rect rect = new Rect(0, 0, round, round);
            Paint paint2 = new Paint(1);
            if (Build.VERSION.SDK_INT >= 26) {
                color = getResources().getColor(AbstractC16801x.cM0, null);
                paint2.setColor(color);
            } else {
                paint2.setColor(getResources().getColor(AbstractC16801x.cM0_alpha50));
            }
            canvas2.drawCircle(rect.centerX(), rect.centerY(), rect.width() / 2, paint2);
            int i13 = (round - dimensionPixelSize) / 2;
            int i14 = (round - i11) / 2;
            canvas2.drawBitmap(createBitmap, (Rect) null, new Rect(i13, i14, dimensionPixelSize + i13, i11 + i14), paint);
            createBitmap.recycle();
            return createBitmap2;
        }
        return createBitmap;
    }

    int getNumOfNeedLoadAvatars() {
        if (this.f69277z == 4 && this.f69267R != null) {
            return Math.min(this.f69250A.size(), 3);
        }
        return Math.min(this.f69250A.size(), this.f69277z);
    }

    public int getStrokeWidth() {
        int i11 = this.f69265P;
        if (i11 <= 0) {
            return AbstractC23136l9.m118742r(2.0f);
        }
        return i11;
    }

    public int getViewType() {
        return this.f69277z;
    }

    /* renamed from: i */
    public void m75736i(boolean z11, boolean z12) {
        int i11;
        int i12;
        this.f69254E = true;
        this.f69255F = z12;
        try {
            int i13 = this.f69259J;
            this.f69253D = i13;
            C13703p0 c13703p0 = this.f69269r;
            c13703p0.f70910o = true;
            c13703p0.m76610j(this.f69251B - (i13 * 2), this.f69252C - (i13 * 2));
            if (z11) {
                if (z12) {
                    i11 = this.f69261L[0];
                } else {
                    i11 = this.f69262M[0];
                }
            } else {
                i11 = this.f69260K[0];
            }
            int i14 = i11;
            if (z11) {
                if (z12) {
                    i12 = this.f69261L[1];
                } else {
                    i12 = this.f69262M[1];
                }
            } else {
                i12 = this.f69260K[1];
            }
            this.f69264O.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f69252C, i14, i12, Shader.TileMode.MIRROR));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.save();
        int i11 = this.f69253D;
        canvas.translate(i11, i11);
        C13703p0 c13703p0 = this.f69269r;
        if (c13703p0 != null) {
            c13703p0.m76603a(canvas);
        }
        canvas.restore();
        if (this.f69256G) {
            float f11 = (this.f69258I + 1.0f) % 360.0f;
            this.f69258I = f11;
            canvas.rotate(f11, this.f69251B / 2.0f, this.f69252C / 2.0f);
        }
        if (this.f69254E) {
            canvas.drawArc(this.f69263N, 0.0f, 360.0f, false, this.f69264O);
        }
        if (this.f69256G) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f69251B = i11;
        this.f69252C = i12;
        C13703p0 c13703p0 = this.f69269r;
        if (c13703p0 != null) {
            int i15 = this.f69253D;
            c13703p0.m76610j(i11 - (i15 * 2), i12 - (i15 * 2));
        }
    }

    public void setImageDrawable(Drawable drawable) {
        this.f69277z = 1;
        AbstractC3972e.m18783g0(this.f69270s[0]);
        Drawable[] drawableArr = this.f69271t;
        drawableArr[0] = drawable;
        this.f69269r.m76608h(this.f69277z, null, drawableArr);
    }

    public void setImageOption(C24003n c24003n) {
        if (c24003n != null && this.f69272u != c24003n) {
            this.f69272u = c24003n;
            this.f69273v = c24003n.f116261b;
        }
    }

    public void setImageResource(int i11) {
        this.f69277z = 1;
        AbstractC3972e.m18783g0(this.f69270s[0]);
        this.f69271t[0] = AbstractC23136l9.m118665N(getContext(), i11);
        this.f69269r.m76608h(this.f69277z, null, this.f69271t);
    }

    public void setPaddingStrokeStory(int i11) {
        this.f69259J = i11;
        m75736i(this.f69254E, this.f69255F);
    }

    public void setScrollingMode(boolean z11) {
        this.f69274w = z11;
    }

    public void setShortDpnAvt(String str) {
        this.f69275x = str;
    }

    public void setStateLoadingStory(boolean z11) {
        this.f69256G = z11;
        if (z11) {
            this.f69264O.setPathEffect(this.f69257H);
        } else {
            this.f69264O.setPathEffect(null);
        }
        invalidate();
    }

    public void setStrokeDisableColor(int[] iArr) {
        this.f69262M = iArr;
        m75736i(this.f69254E, this.f69255F);
    }

    public void setStrokeEnableColor(int[] iArr) {
        this.f69261L = iArr;
        m75736i(this.f69254E, this.f69255F);
    }

    public void setStrokeStoryWidth(int i11) {
        try {
            this.f69265P = i11;
            int i12 = this.f69265P;
            this.f69263N = new RectF(i12 / 2.0f, i12 / 2.0f, this.f69251B - (i12 / 2.0f), this.f69252C - (i12 / 2.0f));
            this.f69264O.setStrokeWidth(this.f69265P);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setUidForGenColor(String str) {
        this.f69276y = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1 A[LOOP:0: B:11:0x009c->B:13:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i11;
        int i12;
        C3977j[] c3977jArr;
        int i13;
        this.f69270s = new C3977j[4];
        this.f69271t = new Drawable[4];
        C24003n m120143n = C23278z2.m120143n();
        this.f69272u = m120143n;
        this.f69273v = m120143n.f116261b;
        this.f69274w = false;
        this.f69275x = "";
        this.f69276y = "";
        this.f69277z = 1;
        this.f69250A = new ArrayList();
        this.f69253D = 0;
        this.f69254E = false;
        this.f69255F = false;
        this.f69256G = false;
        this.f69258I = 0.0f;
        this.f69259J = 0;
        this.f69266Q = Color.parseColor("#ffffff");
        this.f69267R = null;
        this.f69268q = new C23528a(getContext());
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(AbstractC16802y.avt_image_size_default);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_width, R.attr.layout_height});
            try {
                try {
                    i13 = obtainStyledAttributes.getDimensionPixelSize(0, dimensionPixelSize);
                    try {
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
                    } catch (Exception e11) {
                        e = e11;
                        AbstractC20110a.m104539h(e);
                        obtainStyledAttributes.recycle();
                        obtainStyledAttributes = dimensionPixelSize;
                        dimensionPixelSize = i13;
                        i11 = obtainStyledAttributes;
                        this.f69251B = dimensionPixelSize;
                        this.f69252C = i11;
                        int i14 = this.f69251B;
                        int i15 = this.f69253D;
                        this.f69269r = new C13703p0(this, i14 - (i15 * 2), this.f69252C - (i15 * 2), false);
                        i12 = 0;
                        while (true) {
                            c3977jArr = this.f69270s;
                            if (i12 >= c3977jArr.length) {
                            }
                            c3977jArr[i12] = new C3977j(getContext());
                            i12++;
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    i13 = dimensionPixelSize;
                }
                obtainStyledAttributes.recycle();
                obtainStyledAttributes = dimensionPixelSize;
                dimensionPixelSize = i13;
                i11 = obtainStyledAttributes;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = dimensionPixelSize;
        }
        this.f69251B = dimensionPixelSize;
        this.f69252C = i11;
        int i142 = this.f69251B;
        int i152 = this.f69253D;
        this.f69269r = new C13703p0(this, i142 - (i152 * 2), this.f69252C - (i152 * 2), false);
        i12 = 0;
        while (true) {
            c3977jArr = this.f69270s;
            if (i12 >= c3977jArr.length) {
                c3977jArr[i12] = new C3977j(getContext());
                i12++;
            } else {
                this.f69259J = AbstractC23136l9.m118742r(3.5f);
                this.f69265P = AbstractC23136l9.m118742r(2.0f);
                int i16 = this.f69265P;
                this.f69263N = new RectF(i16 / 2.0f, i16 / 2.0f, this.f69251B - (i16 / 2.0f), this.f69252C - (i16 / 2.0f));
                Paint paint = new Paint(1);
                this.f69264O = paint;
                paint.setStrokeWidth(this.f69265P);
                this.f69264O.setColor(this.f69266Q);
                this.f69264O.setStyle(Paint.Style.STROKE);
                this.f69260K = AbstractC22055v0.m115164x(context);
                this.f69261L = AbstractC22055v0.m115163w(context);
                this.f69262M = new int[]{C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor), C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor)};
                this.f69257H = new DashPathEffect(new float[]{AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(5.0f)}, 0.0f);
                return;
            }
        }
    }
}
