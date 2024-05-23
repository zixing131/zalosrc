package com.zing.zalo.p077ui.mycloud.gridtab;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import b40.C2535j;
import bi0.AbstractC2807a;
import bi0.AbstractC2809c;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import dj.C17945a0;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import java.util.Arrays;
import kd0.C21693c;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p588vw.C28652r;
import p716zh.C32175x6;
import ti0.C26705d;
import ti0.C26707f;
import u80.InterfaceC27158o2;
import ui0.C27280g;
import x70.C29428k0;

/* loaded from: classes6.dex */
public class PhotoGridChatItemView extends GridChatItemViewBase {

    /* renamed from: A0 */
    protected C16716d f65721A0;

    /* renamed from: B0 */
    private C16716d f65722B0;

    /* renamed from: C0 */
    private C22122a0 f65723C0;

    /* renamed from: D0 */
    private C16716d f65724D0;

    /* renamed from: E0 */
    private final RecyclingImageView f65725E0;

    /* renamed from: F0 */
    private C22126c0 f65726F0;

    /* renamed from: G0 */
    private GradientDrawable f65727G0;

    /* renamed from: H0 */
    private final float f65728H0;

    /* renamed from: I0 */
    private C29428k0 f65729I0;

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.PhotoGridChatItemView$a */
    /* loaded from: classes6.dex */
    public static final class C12578a implements C29428k0.h {

        /* renamed from: b */
        final /* synthetic */ C17945a0 f65731b;

        C12578a(C17945a0 c17945a0) {
            this.f65731b = c17945a0;
        }

        @Override // x70.C29428k0.h
        /* renamed from: a */
        public void mo65107a(C29428k0.a aVar, C32175x6 c32175x6) {
            C17945a0 m71033m;
            AbstractC19074t.m100208f(aVar, "photoEntity");
            AbstractC19074t.m100208f(c32175x6, "photoItem");
            MyCloudMessageItem data = PhotoGridChatItemView.this.getData();
            if (data != null && (m71033m = data.m71033m()) != null) {
                PhotoGridChatItemView.this.mo70892R0(m71033m);
            }
        }

        @Override // x70.C29428k0.h
        /* renamed from: b */
        public void mo65108b(C29428k0.a aVar, C32175x6 c32175x6) {
            C17945a0 c17945a0;
            C17945a0 m71033m;
            AbstractC19074t.m100208f(aVar, "photoEntity");
            MyCloudMessageItem data = PhotoGridChatItemView.this.getData();
            if (data != null) {
                c17945a0 = data.m71033m();
            } else {
                c17945a0 = null;
            }
            if (!AbstractC19074t.m100204b(c17945a0, this.f65731b)) {
                return;
            }
            PhotoGridChatItemView.this.mo70930d1(c17945a0, c17945a0.m95022U7());
            MyCloudMessageItem data2 = PhotoGridChatItemView.this.getData();
            if (data2 != null && (m71033m = data2.m71033m()) != null) {
                PhotoGridChatItemView.this.mo70892R0(m71033m);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoGridChatItemView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f65725E0 = new RecyclingImageView(context);
        this.f65728H0 = AbstractC23136l9.m118655I(AbstractC2809c.corner_08);
    }

    /* renamed from: Y0 */
    private final void m70925Y0() {
        MyCloudMessageItem data;
        if (getData() != null && (data = getData()) != null) {
            SpannableString m71040w = data.m71040w();
            if (data.m71040w().length() > 0) {
                C22126c0 c22126c0 = this.f65726F0;
                if (c22126c0 == null) {
                    C22126c0 c22126c02 = new C22126c0(getContext());
                    c22126c02.m89106L().m89028L(-1, -2).m89041Y(AbstractC23222t7.f112576o).m89072y(Boolean.TRUE);
                    Context context = c22126c02.getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    new C26707f(c22126c02).m137318a(C26705d.m137293a(context, AbstractC2814h.t_normal));
                    c22126c02.m89087B0(AbstractC16803z.bg_bottom_corner_8dp_black70);
                    c22126c02.m111962J1(C23212s8.m119607o(c22126c02.getContext(), AbstractC2807a.text_04));
                    c22126c02.m111953A1(2);
                    c22126c02.m111980v1(TextUtils.TruncateAt.END);
                    this.f65726F0 = c22126c02;
                } else if (c22126c0 != null) {
                    c22126c0.mo44614b1(0);
                }
                C22126c0 c22126c03 = this.f65726F0;
                if (c22126c03 != null) {
                    getContainerModule().m89001g1(c22126c03);
                    c22126c03.m111959G1(C28652r.m143349v().m143354E(m71040w));
                    return;
                }
                return;
            }
            C22126c0 c22126c04 = this.f65726F0;
            if (c22126c04 != null) {
                c22126c04.mo44614b1(8);
            }
        }
    }

    /* renamed from: Z0 */
    public static final void m70926Z0(PhotoGridChatItemView photoGridChatItemView, C16716d c16716d, C16719g c16719g) {
        C17945a0 m71033m;
        BaseMyCloudTabView.AbstractC12510b delegate;
        AbstractC19074t.m100208f(photoGridChatItemView, "this$0");
        AbstractC19074t.m100208f(c16716d, "$this_apply");
        MyCloudMessageItem data = photoGridChatItemView.getData();
        if (data != null && (m71033m = data.m71033m()) != null) {
            if (m71033m.m95022U7()) {
                Context context = c16716d.getContext();
                if (context != null && (delegate = photoGridChatItemView.getDelegate()) != null) {
                    delegate.mo70399r(context, m71033m);
                    return;
                }
                return;
            }
            BaseMyCloudTabView.AbstractC12510b delegate2 = photoGridChatItemView.getDelegate();
            if (delegate2 != null) {
                delegate2.mo70381C(photoGridChatItemView, m71033m);
            }
        }
    }

    /* renamed from: a1 */
    public static final void m70927a1(PhotoGridChatItemView photoGridChatItemView, C16719g c16719g) {
        InterfaceC27158o2 selectEventListener;
        AbstractC19074t.m100208f(photoGridChatItemView, "this$0");
        MyCloudMessageItem data = photoGridChatItemView.getData();
        if (data != null && (selectEventListener = photoGridChatItemView.getSelectEventListener()) != null) {
            int position = photoGridChatItemView.getPosition();
            C22122a0 c22122a0 = photoGridChatItemView.f65723C0;
            if (c22122a0 == null) {
                AbstractC19074t.m100223u("imageModule");
                c22122a0 = null;
            }
            selectEventListener.mo70520c(data, position, c22122a0);
        }
    }

    /* renamed from: b1 */
    private final void m70928b1() {
        float f11;
        float f12;
        int i11 = AbstractC23222t7.f112566j;
        float f13 = i11;
        float f14 = i11;
        if (!getViewOriginalMsgVisible() && !getHasReply()) {
            int i12 = AbstractC23222t7.f112566j;
            f11 = i12;
            f12 = i12;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        if (this.f65727G0 == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(C23212s8.m119607o(getContext(), AbstractC2807a.layer_background_subtle));
            gradientDrawable.setStroke(AbstractC23222t7.f112550b, C23212s8.m119607o(getContext(), AbstractC2807a.border_subtle));
            this.f65727G0 = gradientDrawable;
        }
        GradientDrawable gradientDrawable2 = this.f65727G0;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setCornerRadii(new float[]{f11, f11, f12, f12, f13, f13, f14, f14});
        }
    }

    /* renamed from: c1 */
    private final void m70929c1() {
        C29428k0.a bVar;
        MyCloudMessageItem data = getData();
        if (data == null) {
            return;
        }
        try {
            C17945a0 m71033m = data.m71033m();
            if (m71033m.m95022U7()) {
                mo70930d1(m71033m, true);
                return;
            }
            mo70930d1(m71033m, false);
            if (AbstractC23306f.m120691m2().m2466q()) {
                bVar = new C29428k0.i(m71033m);
            } else {
                bVar = new C29428k0.b(m71033m);
            }
            C29428k0.a aVar = bVar;
            C29428k0 c29428k0 = this.f65729I0;
            if (c29428k0 == null) {
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                C23528a aQuery = getAQuery();
                C22122a0 c22122a0 = this.f65723C0;
                if (c22122a0 == null) {
                    AbstractC19074t.m100223u("imageModule");
                    c22122a0 = null;
                }
                C29428k0 c29428k02 = new C29428k0(3, context, aQuery, c22122a0, this.f65725E0, aVar);
                c29428k02.m146628d0(2);
                c29428k02.m146624Z(this.f65727G0);
                c29428k02.m146627c0(new C12578a(m71033m));
                c29428k02.m146623O();
                this.f65729I0 = c29428k02;
                return;
            }
            if (c29428k0 != null) {
                c29428k0.m146624Z(this.f65727G0);
                c29428k0.m146626b0(aVar);
                c29428k0.m146623O();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: C0 */
    public C16719g mo70813C0() {
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(-2, -1);
        setContainerModule(c16716d);
        C16716d c16716d2 = new C16716d(getContext());
        c16716d2.m89106L().m89028L(-1, -1);
        c16716d2.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.mycloud.gridtab.g0

            /* renamed from: q */
            public final /* synthetic */ C16716d f65775q;

            public /* synthetic */ C12599g0(C16716d c16716d22) {
                r2 = c16716d22;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                PhotoGridChatItemView.m70926Z0(PhotoGridChatItemView.this, r2, c16719g);
            }
        });
        c16716d22.m89111N0(new C16719g.d() { // from class: com.zing.zalo.ui.mycloud.gridtab.h0
            public /* synthetic */ C12601h0() {
            }

            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                PhotoGridChatItemView.m70927a1(PhotoGridChatItemView.this, c16719g);
            }
        });
        this.f65722B0 = c16716d22;
        C22122a0 c22122a0 = new C22122a0(getContext());
        c22122a0.m89106L().m89028L(-1, -1).m89031O(AbstractC23222t7.f112550b);
        c22122a0.mo111927x1(this.f65728H0);
        c22122a0.m111929z1(5);
        this.f65723C0 = c22122a0;
        C16716d c16716d3 = this.f65722B0;
        C16716d c16716d4 = null;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("mediaContainerModule");
            c16716d3 = null;
        }
        C22122a0 c22122a02 = this.f65723C0;
        if (c22122a02 == null) {
            AbstractC19074t.m100223u("imageModule");
            c22122a02 = null;
        }
        c16716d3.m89001g1(c22122a02);
        C16716d containerModule = getContainerModule();
        C16716d c16716d5 = this.f65722B0;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("mediaContainerModule");
        } else {
            c16716d4 = c16716d5;
        }
        containerModule.m89001g1(c16716d4);
        return getContainerModule();
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: Q0 */
    public void mo70814Q0() {
        super.mo70814Q0();
        C16716d c16716d = this.f65724D0;
        if (c16716d != null) {
            c16716d.mo44614b1(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: R0 */
    public void mo70892R0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        super.mo70892R0(c17945a0);
        try {
            if (c17945a0.m94959N6()) {
                setRetryVisible(true);
                return;
            }
            if (!c17945a0.m95180k8()) {
                if (!c17945a0.m95022U7()) {
                    byte m95089b4 = (byte) c17945a0.m95089b4();
                    if (m95089b4 != 0 && m95089b4 != 1) {
                        if (m95089b4 != 2 && m95089b4 != 3 && m95089b4 != 4) {
                            return;
                        }
                        if (!getMExternalStates().m143918k() && getMExternalStates().m143920m()) {
                            setShowLoadingProgress(!getMRetryVisible());
                            return;
                        }
                        return;
                    }
                    setShowLoadingProgress(!getMRetryVisible());
                    return;
                }
                return;
            }
            byte m95107d3 = (byte) c17945a0.m95107d3();
            if (m95107d3 == 4) {
                setShowLoadingProgress(!getMRetryVisible());
                return;
            }
            if (m95107d3 == 5) {
                if (!getMExternalStates().m143918k() && getMExternalStates().m143920m()) {
                    setShowLoadingProgress(!getMRetryVisible());
                    return;
                }
                return;
            }
            if (m95107d3 != 6 && m95107d3 != 7) {
                if (m95107d3 == 8) {
                    setRetryVisible(true);
                    return;
                }
                return;
            }
            if (!c17945a0.m95022U7() && getMExternalStates().m143920m()) {
                setShowLoadingProgress(!getMRetryVisible());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: d1 */
    public void mo70930d1(C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (z11) {
            C16716d c16716d = new C16716d(getContext());
            c16716d.m89106L().m89060k0(-1).m89030N(-1).m89041Y(AbstractC23222t7.f112566j).m89029M(15);
            C21693c c21693c = new C21693c(getContext());
            c21693c.m89106L().m89060k0(-2).m89030N(-2).m89026J(true);
            c21693c.m111929z1(4);
            if (c17945a0.m95306y8()) {
                Context context = c21693c.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                Drawable m139660c = C27280g.m139660c(context, AbstractC2810d.zds_ic_video_failed_solid_24, AbstractC2807a.icon_03);
                if (m139660c != null) {
                    c21693c.mo111925v1(m139660c);
                }
            } else {
                Context context2 = c21693c.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                Drawable m139660c2 = C27280g.m139660c(context2, AbstractC2810d.zds_ic_photo_error_solid_24, AbstractC2807a.icon_03);
                if (m139660c2 != null) {
                    c21693c.mo111925v1(m139660c2);
                }
            }
            c16716d.m89001g1(c21693c);
            this.f65724D0 = c16716d;
            C16716d c16716d2 = this.f65722B0;
            if (c16716d2 == null) {
                AbstractC19074t.m100223u("mediaContainerModule");
                c16716d2 = null;
            }
            c16716d2.m89001g1(c16716d);
            c16716d.m89085A0(this.f65727G0);
            c16716d.mo44614b1(0);
        } else {
            C16716d c16716d3 = this.f65724D0;
            if (c16716d3 != null) {
                c16716d3.mo44614b1(8);
            }
        }
        C2535j.f10308a.m12775s("csc", c17945a0, z11);
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase, com.zing.zalo.zview.animation.AnimationTarget
    public Rect getAnimTargetLocationOnScreen() {
        C17945a0 c17945a0;
        MyCloudMessageItem data = getData();
        C22122a0 c22122a0 = null;
        if (data != null) {
            c17945a0 = data.m71033m();
        } else {
            c17945a0 = null;
        }
        if (c17945a0 == null) {
            return null;
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        rect.left = iArr[0];
        rect.top = (iArr[1] + getItemHeight()) - getContentHeight();
        int i11 = rect.left;
        C22122a0 c22122a02 = this.f65723C0;
        if (c22122a02 == null) {
            AbstractC19074t.m100223u("imageModule");
            c22122a02 = null;
        }
        rect.right = i11 + c22122a02.m89114P();
        int i12 = rect.top;
        C22122a0 c22122a03 = this.f65723C0;
        if (c22122a03 == null) {
            AbstractC19074t.m100223u("imageModule");
        } else {
            c22122a0 = c22122a03;
        }
        rect.bottom = i12 + c22122a0.m89112O();
        return rect;
    }

    public final C16716d getContainerModule() {
        C16716d c16716d = this.f65721A0;
        if (c16716d != null) {
            return c16716d;
        }
        AbstractC19074t.m100223u("containerModule");
        return null;
    }

    public final float getCorner() {
        return this.f65728H0;
    }

    protected final void setContainerModule(C16716d c16716d) {
        AbstractC19074t.m100208f(c16716d, "<set-?>");
        this.f65721A0 = c16716d;
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: w0 */
    public void mo70815w0() {
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("image#%s", Arrays.copyOf(new Object[]{Integer.valueOf(getPosition())}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        setTag(format);
        C22122a0 c22122a0 = null;
        if ((getViewOriginalMsgVisible() && getViewOriginalMsgView() != null) || (getHasReply() && getReplyContentView() != null)) {
            C22122a0 c22122a02 = this.f65723C0;
            if (c22122a02 == null) {
                AbstractC19074t.m100223u("imageModule");
                c22122a02 = null;
            }
            float f11 = this.f65728H0;
            c22122a02.m111928y1(0.0f, 0.0f, f11, f11);
            C22122a0 c22122a03 = this.f65723C0;
            if (c22122a03 == null) {
                AbstractC19074t.m100223u("imageModule");
            } else {
                c22122a0 = c22122a03;
            }
            c22122a0.m89106L().m89036T(0);
        } else {
            C22122a0 c22122a04 = this.f65723C0;
            if (c22122a04 == null) {
                AbstractC19074t.m100223u("imageModule");
            } else {
                c22122a0 = c22122a04;
            }
            c22122a0.mo111927x1(this.f65728H0);
        }
        m70928b1();
        m70929c1();
        m70925Y0();
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: x0 */
    public void mo70893x0(MyCloudMessageItem myCloudMessageItem, int i11, int i12, int i13) {
        C21693c retryModule;
        AbstractC19074t.m100208f(myCloudMessageItem, "data");
        super.mo70893x0(myCloudMessageItem, i11, i12, i13);
        if (myCloudMessageItem.m71033m().m95180k8() && ((byte) myCloudMessageItem.m71033m().m95107d3()) == 3 && (retryModule = getRetryModule()) != null) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            retryModule.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_download_line_24, AbstractC2807a.icon_04));
        }
    }
}
