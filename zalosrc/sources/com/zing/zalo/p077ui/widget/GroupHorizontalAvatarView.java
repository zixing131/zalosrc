package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.AbstractC1388a;
import au.C2343e;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8923h0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.custom.DrawableCallbackView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23222t7;
import me0.C23278z2;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;

/* loaded from: classes6.dex */
public class GroupHorizontalAvatarView extends DrawableCallbackView {

    /* renamed from: A */
    final Drawable f69283A;

    /* renamed from: B */
    int f69284B;

    /* renamed from: C */
    float f69285C;

    /* renamed from: D */
    int f69286D;

    /* renamed from: E */
    int f69287E;

    /* renamed from: F */
    int f69288F;

    /* renamed from: G */
    boolean f69289G;

    /* renamed from: H */
    int f69290H;

    /* renamed from: I */
    int f69291I;

    /* renamed from: J */
    int f69292J;

    /* renamed from: K */
    int f69293K;

    /* renamed from: L */
    Paint f69294L;

    /* renamed from: M */
    ArrayList f69295M;

    /* renamed from: N */
    public boolean f69296N;

    /* renamed from: O */
    int f69297O;

    /* renamed from: q */
    C23528a f69298q;

    /* renamed from: r */
    C3977j[] f69299r;

    /* renamed from: s */
    Drawable[] f69300s;

    /* renamed from: t */
    Boolean[] f69301t;

    /* renamed from: u */
    C24003n f69302u;

    /* renamed from: v */
    Drawable f69303v;

    /* renamed from: w */
    final Drawable f69304w;

    /* renamed from: x */
    GradientDrawable f69305x;

    /* renamed from: y */
    StaticLayout f69306y;

    /* renamed from: z */
    C13704p1 f69307z;

    /* renamed from: com.zing.zalo.ui.widget.GroupHorizontalAvatarView$a */
    /* loaded from: classes6.dex */
    class C13504a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f69308l1;

        /* renamed from: m1 */
        final /* synthetic */ int f69309m1;

        C13504a(String str, int i11) {
            this.f69308l1 = str;
            this.f69309m1 = i11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (TextUtils.equals(str, this.f69308l1)) {
                    if (c3979l == null || c3979l.m18839c() == null || (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1)) {
                        GroupHorizontalAvatarView groupHorizontalAvatarView = GroupHorizontalAvatarView.this;
                        groupHorizontalAvatarView.f69300s[this.f69309m1] = groupHorizontalAvatarView.f69303v;
                        GroupHorizontalAvatarView.this.invalidate();
                    }
                    C3977j c3977j = GroupHorizontalAvatarView.this.f69299r[this.f69309m1];
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    if (c23995f.m125666q() == 4) {
                        GroupHorizontalAvatarView.this.f69300s[this.f69309m1] = new BitmapDrawable(GroupHorizontalAvatarView.this.getResources(), c3979l.m18839c());
                    } else {
                        GroupHorizontalAvatarView.this.f69300s[this.f69309m1] = new TransitionDrawable(new Drawable[]{GroupHorizontalAvatarView.this.f69302u.f116261b, new BitmapDrawable(GroupHorizontalAvatarView.this.getResources(), c3979l.m18839c())});
                        GroupHorizontalAvatarView groupHorizontalAvatarView2 = GroupHorizontalAvatarView.this;
                        groupHorizontalAvatarView2.f69300s[this.f69309m1].setCallback(groupHorizontalAvatarView2);
                        ((TransitionDrawable) GroupHorizontalAvatarView.this.f69300s[this.f69309m1]).setCrossFadeEnabled(true);
                        ((TransitionDrawable) GroupHorizontalAvatarView.this.f69300s[this.f69309m1]).startTransition(1000);
                    }
                    GroupHorizontalAvatarView.this.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public GroupHorizontalAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C24003n m120143n = C23278z2.m120143n();
        this.f69302u = m120143n;
        this.f69303v = m120143n.f116261b;
        this.f69284B = 6;
        this.f69285C = 1.0f;
        int i11 = 0;
        this.f69286D = 0;
        this.f69287E = Color.parseColor("#FFFFFF");
        this.f69288F = AbstractC23222t7.f112550b;
        this.f69289G = false;
        this.f69292J = 0;
        this.f69293K = 0;
        this.f69295M = new ArrayList();
        this.f69296N = false;
        this.f69297O = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.GroupHorizontalAvatarView);
        this.f69284B = obtainStyledAttributes.getInteger(AbstractC8923h0.GroupHorizontalAvatarView_hrav_maxAvatarShow, 6);
        this.f69288F = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.GroupHorizontalAvatarView_hrav_strokeWidth, 0);
        this.f69287E = obtainStyledAttributes.getColor(AbstractC8923h0.GroupHorizontalAvatarView_hrav_strokeColor, AbstractC23136l9.m118641B(context, AbstractC16801x.white));
        this.f69285C = obtainStyledAttributes.getFloat(AbstractC8923h0.GroupHorizontalAvatarView_hrav_widthRatio, 1.0f);
        this.f69286D = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.GroupHorizontalAvatarView_hrav_overlap, 0);
        this.f69289G = obtainStyledAttributes.getBoolean(AbstractC8923h0.GroupHorizontalAvatarView_hrav_showOnline, false);
        obtainStyledAttributes.recycle();
        int i12 = this.f69284B;
        this.f69299r = new C3977j[i12 - 1];
        this.f69300s = new Drawable[i12 - 1];
        this.f69301t = new Boolean[i12 - 1];
        this.f69298q = new C23528a(getContext());
        C13704p1 c13704p1 = new C13704p1(1);
        this.f69307z = c13704p1;
        c13704p1.setColor(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
        this.f69307z.m76613c();
        Paint paint = new Paint();
        this.f69294L = paint;
        paint.setAntiAlias(true);
        this.f69294L.setStyle(Paint.Style.STROKE);
        this.f69294L.setColor(this.f69287E);
        this.f69294L.setStrokeWidth(this.f69288F);
        while (true) {
            C3977j[] c3977jArr = this.f69299r;
            if (i11 < c3977jArr.length) {
                c3977jArr[i11] = new C3977j(getContext());
                i11++;
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                this.f69305x = gradientDrawable;
                gradientDrawable.setShape(1);
                this.f69305x.setColor(AbstractC1388a.m6961c(context, AbstractC16801x.group_count_bg));
                this.f69304w = AbstractC1388a.m6964f(context, AbstractC16803z.default_avatar);
                this.f69283A = AbstractC1388a.m6964f(context, AbstractC16803z.online_status_green_ic_round);
                return;
            }
        }
    }

    /* renamed from: a */
    public void m75737a(List list, int i11) {
        String str;
        String str2;
        char c11;
        String str3;
        boolean z11;
        this.f69295M.clear();
        this.f69295M.addAll(list);
        int min = Math.min(this.f69295M.size(), this.f69284B - 1);
        this.f69297O = min;
        int i12 = i11 - min;
        if (i12 > 0 && i12 != this.f69292J) {
            this.f69306y = new StaticLayout(AbstractC23184q2.m119455m(i12), this.f69307z, this.f69290H, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        this.f69292J = i12;
        int i13 = 0;
        while (true) {
            try {
                Drawable[] drawableArr = this.f69300s;
                if (i13 >= drawableArr.length) {
                    break;
                }
                drawableArr[i13] = this.f69303v;
                this.f69301t[i13] = Boolean.FALSE;
                i13++;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        for (int i14 = 0; i14 < Math.min(this.f69295M.size(), this.f69300s.length); i14++) {
            AbstractC3972e.m18783g0(this.f69299r[i14]);
            ContactProfile contactProfile = (ContactProfile) this.f69295M.get(i14);
            String str4 = null;
            if (contactProfile != null) {
                str2 = contactProfile.f42446v;
                if (TextUtils.isEmpty(str2)) {
                    str3 = null;
                    c11 = 1;
                } else if (C23302b.f113247a.m120523d(str2) && !CoreUtility.f89233i.equals(contactProfile.f42434r)) {
                    str4 = contactProfile.m40418n0();
                    str3 = contactProfile.f42434r;
                    c11 = 3;
                } else {
                    str3 = null;
                    c11 = 2;
                }
                Boolean[] boolArr = this.f69301t;
                if (contactProfile.f42338F1 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolArr[i14] = Boolean.valueOf(z11);
                str = str4;
                str4 = str3;
            } else {
                str = null;
                str2 = null;
                c11 = 1;
            }
            if (c11 == 3 && str4 != null && str != null) {
                this.f69300s[i14] = C16640q2.m88404a().mo88412f(str, C2343e.m12307a(str4, false));
            } else if (c11 == 2) {
                if (!this.f69296N || C23999j.m125696L2(str2, this.f69302u)) {
                    ((C23528a) this.f69298q.m123612r(this.f69299r[i14])).m123579C(str2, this.f69302u, new C13504a(str2, i14));
                }
            } else {
                this.f69300s[i14] = this.f69304w;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f69297O; i12++) {
            Drawable drawable = this.f69300s[i12];
            if (drawable != null) {
                int i13 = this.f69290H;
                drawable.setBounds(i11, 0, i11 + i13, i13);
                this.f69300s[i12].draw(canvas);
                if (this.f69288F > 0) {
                    float f11 = this.f69290H / 2.0f;
                    canvas.drawCircle(i11 + f11, f11, f11, this.f69294L);
                }
                if (this.f69289G && this.f69301t[i12].booleanValue()) {
                    Drawable drawable2 = this.f69283A;
                    int i14 = this.f69290H;
                    int i15 = this.f69293K;
                    drawable2.setBounds((i11 + i14) - i15, i14 - i15, i11 + i14, i14);
                    this.f69283A.draw(canvas);
                }
                i11 = (i11 + this.f69290H) - this.f69286D;
            }
        }
        if (this.f69292J > 0) {
            GradientDrawable gradientDrawable = this.f69305x;
            int i16 = this.f69290H;
            gradientDrawable.setBounds(i11, 0, i11 + i16, i16);
            this.f69305x.draw(canvas);
            if (this.f69288F > 0) {
                float f12 = this.f69290H / 2.0f;
                canvas.drawCircle(i11 + f12, f12, f12, this.f69294L);
            }
            canvas.save();
            canvas.translate(i11 + ((this.f69290H - this.f69306y.getWidth()) / 2), (this.f69290H - this.f69306y.getHeight()) / 2);
            this.f69306y.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int i13 = (int) (this.f69285C * size);
        setMeasuredDimension(size, ((int) ((i13 - r0) / this.f69284B)) + this.f69286D);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        int i15 = (int) (this.f69285C * i11);
        int i16 = ((int) ((i15 - r10) / this.f69284B)) + this.f69286D;
        this.f69290H = i16;
        this.f69291I = i16;
        this.f69293K = i16 / 4;
        this.f69307z.setTextSize(i16 / 3.0f);
        this.f69306y = new StaticLayout(AbstractC23184q2.m119455m(this.f69292J), this.f69307z, this.f69290H, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }
}
