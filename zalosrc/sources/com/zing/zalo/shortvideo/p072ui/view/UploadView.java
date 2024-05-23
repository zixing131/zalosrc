package com.zing.zalo.shortvideo.p072ui.view;

import android.graphics.Outline;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.lifecycle.AbstractC1785o;
import androidx.recyclerview.widget.LinearLayoutManager;
import bi0.AbstractC2808b;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.SearchHashTag;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.component.popup.ConfirmPopupView;
import com.zing.zalo.shortvideo.p072ui.view.UploadView;
import com.zing.zalo.shortvideo.p072ui.widget.SwitchView;
import com.zing.zalo.shortvideo.p072ui.widget.et.NestedEditText;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import h20.InterfaceC19736t;
import ho0.AbstractC20110a;
import i20.C20196i;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jg0.InterfaceC21251f;
import ln0.AbstractC22543l;
import m20.InterfaceC22811w1;
import on0.AbstractC24342w;
import p021an.AbstractC0955d;
import p354n3.C23528a;
import p542ub.InterfaceC27218a;
import p559uv.C27373c;
import p667y2.C30268e;
import pm0.AbstractC24856m;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import q10.C25067x1;
import q20.C25097t;
import qm0.AbstractC25361o0;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27410e;
import v00.AbstractC27413h;
import v00.C27417l;
import w00.AbstractC28684a;
import z10.C31161e0;

/* loaded from: classes5.dex */
public final class UploadView extends SimpleView implements InterfaceC22811w1 {
    public static final C10491a Companion = new C10491a(null);

    /* renamed from: B0 */
    private InterfaceC19736t f53420B0;

    /* renamed from: C0 */
    private C25067x1 f53421C0;

    /* renamed from: D0 */
    private C31161e0 f53422D0;

    /* renamed from: E0 */
    private C23528a f53423E0;

    /* renamed from: F0 */
    private final InterfaceC24854k f53424F0;

    /* renamed from: G0 */
    private C20196i f53425G0;

    /* renamed from: H0 */
    private final Pattern f53426H0;

    /* renamed from: I0 */
    private String f53427I0;

    /* renamed from: J0 */
    private boolean f53428J0;

    /* renamed from: K0 */
    private boolean f53429K0;

    /* renamed from: L0 */
    private boolean f53430L0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadView$a */
    /* loaded from: classes5.dex */
    public static final class C10491a {
        private C10491a() {
        }

        public /* synthetic */ C10491a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadView$b */
    /* loaded from: classes5.dex */
    public static final class C10492b extends MetricAffectingSpan {
        C10492b() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "paint");
            C25067x1 c25067x1 = UploadView.this.f53421C0;
            C25067x1 c25067x12 = null;
            if (c25067x1 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x1 = null;
            }
            ScrollView root = c25067x1.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            textPaint.setTypeface(AbstractC26112n.m134364E(root, 9));
            C25067x1 c25067x13 = UploadView.this.f53421C0;
            if (c25067x13 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25067x12 = c25067x13;
            }
            ScrollView root2 = c25067x12.getRoot();
            AbstractC19074t.m100207e(root2, "getRoot(...)");
            textPaint.setColor(AbstractC26112n.m134426u(root2, AbstractC2808b.white));
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "textPaint");
            updateDrawState(textPaint);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadView$c */
    /* loaded from: classes5.dex */
    static final class C10493c extends AbstractC19075u implements InterfaceC18494a {
        C10493c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55066a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55066a() {
            C25067x1 c25067x1 = UploadView.this.f53421C0;
            C25067x1 c25067x12 = null;
            if (c25067x1 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x1 = null;
            }
            c25067x1.f120420w.m9837K1(0);
            C25067x1 c25067x13 = UploadView.this.f53421C0;
            if (c25067x13 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25067x12 = c25067x13;
            }
            c25067x12.f120415r.requestFocus();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadView$d */
    /* loaded from: classes5.dex */
    public static final class C10494d implements C31161e0.b {
        C10494d() {
        }

        @Override // z10.C31161e0.b
        /* renamed from: a */
        public void mo54791a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "next");
        }

        @Override // z10.C31161e0.b
        /* renamed from: b */
        public void mo54792b(SearchHashTag searchHashTag) {
            String m127189r0;
            Map m131401f;
            String str;
            String str2;
            CharSequence m127193v0;
            AbstractC19074t.m100208f(searchHashTag, "searchHashTag");
            try {
                String str3 = searchHashTag.m51145c() + " ";
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = UploadView.this.m92652XI(AbstractC27413h.zch_action_key_post_video_hashtag_select);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m127189r0 = AbstractC24342w.m127189r0(str3, "#");
                m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("hashtag", m127189r0));
                c19205a.m100713L(m92652XI, m131401f);
                C25067x1 c25067x1 = UploadView.this.f53421C0;
                C25067x1 c25067x12 = null;
                if (c25067x1 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25067x1 = null;
                }
                Editable text = c25067x1.f120415r.getText();
                if (text != null && text.length() != 0) {
                    Matcher matcher = UploadView.this.f53426H0.matcher(text);
                    C25067x1 c25067x13 = UploadView.this.f53421C0;
                    if (c25067x13 == null) {
                        AbstractC19074t.m100223u("binding");
                        c25067x13 = null;
                    }
                    int selectionStart = c25067x13.f120415r.getSelectionStart();
                    boolean z11 = false;
                    int i11 = 0;
                    while (matcher.find()) {
                        int start = matcher.start();
                        int end = matcher.end();
                        if (selectionStart > start && selectionStart <= end) {
                            z11 = true;
                            i11 = start;
                        }
                    }
                    if (!z11) {
                        UploadView.this.m55053sL();
                        return;
                    }
                    C25067x1 c25067x14 = UploadView.this.f53421C0;
                    if (c25067x14 == null) {
                        AbstractC19074t.m100223u("binding");
                        c25067x14 = null;
                    }
                    Editable text2 = c25067x14.f120415r.getText();
                    if (text2 != null) {
                        str = text2.toString();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        m127193v0 = AbstractC24342w.m127193v0(str, i11, selectionStart, str3);
                        str2 = m127193v0.toString();
                    } else {
                        str2 = null;
                    }
                    String str4 = UploadView.this.f53427I0;
                    if (str4 != null && str2 != null && str2.length() <= 300) {
                        if (str2 != null && str4 != null && str4.length() != 0) {
                            C25067x1 c25067x15 = UploadView.this.f53421C0;
                            if (c25067x15 == null) {
                                AbstractC19074t.m100223u("binding");
                                c25067x15 = null;
                            }
                            c25067x15.f120415r.setText(str2);
                            int length = i11 + str3.length();
                            if (length >= 0 && length <= str2.length()) {
                                C25067x1 c25067x16 = UploadView.this.f53421C0;
                                if (c25067x16 == null) {
                                    AbstractC19074t.m100223u("binding");
                                } else {
                                    c25067x12 = c25067x16;
                                }
                                c25067x12.f120415r.setSelection(length);
                            }
                            UploadView.this.m55053sL();
                            return;
                        }
                        return;
                    }
                    C25097t.f120556a.m130154o(UploadView.this.m92689tK(), UploadView.this.m92652XI(AbstractC27413h.zch_page_upload_video_limit_max_length));
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104548a("zch onSearchHashTagClick ex: " + e11, new Object[0]);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadView$e */
    /* loaded from: classes5.dex */
    static final class C10495e extends AbstractC19075u implements InterfaceC18505l {
        C10495e() {
            super(1);
        }

        /* renamed from: a */
        public final void m55067a(View view) {
            AbstractC19074t.m100208f(view, "it");
            C25067x1 c25067x1 = UploadView.this.f53421C0;
            if (c25067x1 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x1 = null;
            }
            Editable text = c25067x1.f120415r.getText();
            if (text == null || text.length() == 0) {
                C25067x1 c25067x12 = UploadView.this.f53421C0;
                if (c25067x12 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25067x12 = null;
                }
                c25067x12.f120415r.setText("#");
                C25067x1 c25067x13 = UploadView.this.f53421C0;
                if (c25067x13 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25067x13 = null;
                }
                c25067x13.f120415r.setSelection(1);
            } else {
                text.append((CharSequence) "#");
                C25067x1 c25067x14 = UploadView.this.f53421C0;
                if (c25067x14 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25067x14 = null;
                }
                c25067x14.f120415r.setSelection(text.length());
            }
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = UploadView.this.m92652XI(AbstractC27413h.zch_action_key_post_video_hashtag_button);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            c19205a.m100713L(m92652XI, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55067a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadView$f */
    /* loaded from: classes5.dex */
    public static final class C10496f extends ViewOutlineProvider {
        C10496f() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), UploadView.this.m55056vL());
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadView$g */
    /* loaded from: classes5.dex */
    static final class C10497g extends AbstractC19075u implements InterfaceC18505l {
        C10497g() {
            super(1);
        }

        /* renamed from: a */
        public final void m55068a(View view) {
            AbstractC19074t.m100208f(view, "it");
            UploadView.this.m55034C();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55068a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadView$h */
    /* loaded from: classes5.dex */
    static final class C10498h extends AbstractC19075u implements InterfaceC18509p {
        C10498h() {
            super(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m55070c(UploadView uploadView) {
            AbstractC19074t.m100208f(uploadView, "this$0");
            C25067x1 c25067x1 = uploadView.f53421C0;
            if (c25067x1 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x1 = null;
            }
            c25067x1.f120421x.fullScroll(130);
        }

        /* renamed from: b */
        public final void m55071b(int i11, float f11) {
            int m116580c;
            C25067x1 c25067x1 = null;
            if (i11 <= 0 || f11 != 1.0f) {
                C25067x1 c25067x12 = UploadView.this.f53421C0;
                if (c25067x12 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25067x12 = null;
                }
                RoundedImageView roundedImageView = c25067x12.f120418u;
                AbstractC19074t.m100207e(roundedImageView, "ivThumb");
                AbstractC26112n.m134431w0(roundedImageView);
                C25067x1 c25067x13 = UploadView.this.f53421C0;
                if (c25067x13 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25067x13 = null;
                }
                RobotoButton robotoButton = c25067x13.f120414q;
                AbstractC19074t.m100207e(robotoButton, "btnSelect");
                AbstractC26112n.m134431w0(robotoButton);
                UploadView.this.m55053sL();
                C25067x1 c25067x14 = UploadView.this.f53421C0;
                if (c25067x14 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25067x14 = null;
                }
                ScrollView scrollView = c25067x14.f120421x;
                AbstractC19074t.m100207e(scrollView, "scrollView");
                AbstractC26112n.m134411m0(scrollView, 0);
                C25067x1 c25067x15 = UploadView.this.f53421C0;
                if (c25067x15 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25067x15 = null;
                }
                c25067x15.f120421x.stopNestedScroll();
                C25067x1 c25067x16 = UploadView.this.f53421C0;
                if (c25067x16 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c25067x1 = c25067x16;
                }
                c25067x1.f120420w.m9866X1();
                return;
            }
            C25067x1 c25067x17 = UploadView.this.f53421C0;
            if (c25067x17 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x17 = null;
            }
            int height = c25067x17.f120421x.getHeight() - i11;
            C25067x1 c25067x18 = UploadView.this.f53421C0;
            if (c25067x18 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x18 = null;
            }
            int height2 = height - c25067x18.f120419v.getHeight();
            C25067x1 c25067x19 = UploadView.this.f53421C0;
            if (c25067x19 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x19 = null;
            }
            m116580c = AbstractC22543l.m116580c((height2 - c25067x19.f120416s.getHeight()) - AbstractC26105g.m134347n(60), 0);
            C25067x1 c25067x110 = UploadView.this.f53421C0;
            if (c25067x110 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x110 = null;
            }
            FrameLayout frameLayout = c25067x110.f120417t;
            AbstractC19074t.m100207e(frameLayout, "flSuggest");
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = m116580c;
                frameLayout.setLayoutParams(layoutParams);
                C25067x1 c25067x111 = UploadView.this.f53421C0;
                if (c25067x111 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25067x111 = null;
                }
                RoundedImageView roundedImageView2 = c25067x111.f120418u;
                AbstractC19074t.m100207e(roundedImageView2, "ivThumb");
                AbstractC26112n.m134367H(roundedImageView2);
                C25067x1 c25067x112 = UploadView.this.f53421C0;
                if (c25067x112 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25067x112 = null;
                }
                RobotoButton robotoButton2 = c25067x112.f120414q;
                AbstractC19074t.m100207e(robotoButton2, "btnSelect");
                AbstractC26112n.m134367H(robotoButton2);
                C25067x1 c25067x113 = UploadView.this.f53421C0;
                if (c25067x113 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25067x113 = null;
                }
                ScrollView scrollView2 = c25067x113.f120421x;
                AbstractC19074t.m100207e(scrollView2, "scrollView");
                AbstractC26112n.m134411m0(scrollView2, i11);
                C25067x1 c25067x114 = UploadView.this.f53421C0;
                if (c25067x114 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c25067x1 = c25067x114;
                }
                ScrollView scrollView3 = c25067x1.f120421x;
                final UploadView uploadView = UploadView.this;
                scrollView3.post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.view.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        UploadView.C10498h.m55070c(UploadView.this);
                    }
                });
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m55071b(((Number) obj).intValue(), ((Number) obj2).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadView$i */
    /* loaded from: classes5.dex */
    static final class C10499i extends AbstractC19075u implements InterfaceC18505l {
        C10499i() {
            super(1);
        }

        /* renamed from: a */
        public final void m55072a(View view) {
            AbstractC19074t.m100208f(view, "it");
            UploadView.this.m55034C();
            UploadView.this.m55032AL();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55072a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadView$j */
    /* loaded from: classes5.dex */
    static final class C10500j extends AbstractC19075u implements InterfaceC18505l {
        C10500j() {
            super(1);
        }

        /* renamed from: a */
        public final void m55073a(View view) {
            AbstractC19074t.m100208f(view, "it");
            UploadView.this.m55034C();
            InterfaceC19736t interfaceC19736t = UploadView.this.f53420B0;
            if (interfaceC19736t == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19736t = null;
            }
            interfaceC19736t.mo53490Jh();
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = UploadView.this.m92652XI(AbstractC27413h.zch_action_key_post_video_submit);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C19205a.m100675M(c19205a, m92652XI, null, 2, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55073a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadView$k */
    /* loaded from: classes5.dex */
    static final class C10501k extends AbstractC19075u implements InterfaceC18505l {
        C10501k() {
            super(1);
        }

        /* renamed from: a */
        public final void m55074a(View view) {
            String str;
            AbstractC19074t.m100208f(view, "it");
            UploadView.this.f53428J0 = true;
            UploadView.this.m55057wL();
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = UploadView.this.m92652XI(AbstractC27413h.zch_action_key_post_video_edit);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            InterfaceC19736t interfaceC19736t = null;
            C19205a.m100675M(c19205a, m92652XI, null, 2, null);
            InterfaceC19736t interfaceC19736t2 = UploadView.this.f53420B0;
            if (interfaceC19736t2 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC19736t = interfaceC19736t2;
            }
            C27373c mo53491K7 = interfaceC19736t.mo53491K7();
            if (mo53491K7 != null) {
                UploadView uploadView = UploadView.this;
                InterfaceC21251f interfaceC21251f = (InterfaceC21251f) AbstractC0955d.m4496a(uploadView.getContext(), AbstractC19061k0.m100169b(InterfaceC21251f.class));
                if (interfaceC21251f != null) {
                    InterfaceC27218a m92692wK = uploadView.m92692wK();
                    AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
                    CameraInputParams m140379c = C27417l.f129055a.m140379c();
                    m140379c.f41139x = mo53491K7.m140220E();
                    m140379c.f41141y = mo53491K7.m140268v();
                    VideoBlendingParam videoBlendingParam = mo53491K7.f128947T;
                    if (videoBlendingParam == null || (str = videoBlendingParam.f48280t) == null) {
                        str = "";
                    }
                    m140379c.f41083B = str;
                    m140379c.f41082A = mo53491K7;
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    InterfaceC21251f.a.m110057a(interfaceC21251f, m92692wK, m140379c, null, 0, 0, 28, null);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55074a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadView$l */
    /* loaded from: classes5.dex */
    static final class C10502l extends AbstractC19075u implements InterfaceC18505l {
        C10502l() {
            super(1);
        }

        /* renamed from: a */
        public final void m55075a(View view) {
            AbstractC19074t.m100208f(view, "it");
            UploadView.this.f53428J0 = true;
            UploadView.this.m55034C();
            InterfaceC21251f interfaceC21251f = (InterfaceC21251f) AbstractC0955d.m4496a(UploadView.this.getContext(), AbstractC19061k0.m100169b(InterfaceC21251f.class));
            if (interfaceC21251f != null) {
                InterfaceC27218a m92692wK = UploadView.this.m92692wK();
                AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
                CameraInputParams m140379c = C27417l.f129055a.m140379c();
                m140379c.f41138w0 = new SensitiveData("channel_post_video_from_upload", "channel", null, 4, null);
                C24848g0 c24848g0 = C24848g0.f119245a;
                InterfaceC21251f.a.m110057a(interfaceC21251f, m92692wK, m140379c, null, 0, 0, 28, null);
            }
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = UploadView.this.m92652XI(AbstractC27413h.zch_action_key_post_video_change);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C19205a.m100675M(c19205a, m92652XI, null, 2, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55075a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadView$m */
    /* loaded from: classes5.dex */
    static final class C10503m extends AbstractC19075u implements InterfaceC18511r {

        /* renamed from: q */
        final /* synthetic */ NestedEditText f53442q;

        /* renamed from: r */
        final /* synthetic */ UploadView f53443r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10503m(NestedEditText nestedEditText, UploadView uploadView) {
            super(4);
            this.f53442q = nestedEditText;
            this.f53443r = uploadView;
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m55076a((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55076a(CharSequence charSequence, int i11, int i12, int i13) {
            InterfaceC19736t interfaceC19736t;
            Editable text = this.f53442q.getText();
            if (text != null && text.length() != 0) {
                Matcher matcher = this.f53443r.f53426H0.matcher(text);
                int selectionStart = this.f53442q.getSelectionStart();
                this.f53443r.f53430L0 = false;
                boolean z11 = true;
                while (true) {
                    interfaceC19736t = null;
                    if (!matcher.find()) {
                        break;
                    }
                    if (z11) {
                        this.f53443r.m55054tL(text);
                        z11 = false;
                    }
                    int start = matcher.start();
                    int end = matcher.end();
                    String obj = text.subSequence(start, end).toString();
                    if (!AbstractC19074t.m100204b(obj, "#")) {
                        if (selectionStart > start && selectionStart <= end) {
                            if (!AbstractC19074t.m100204b(this.f53443r.f53427I0, obj)) {
                                this.f53443r.f53427I0 = obj;
                                InterfaceC19736t interfaceC19736t2 = this.f53443r.f53420B0;
                                if (interfaceC19736t2 == null) {
                                    AbstractC19074t.m100223u("presenter");
                                } else {
                                    interfaceC19736t = interfaceC19736t2;
                                }
                                interfaceC19736t.mo53494m4(obj);
                                this.f53443r.f53430L0 = true;
                            }
                            AbstractC20110a.f98889a.mo104548a("check hashtag tag:" + obj + " selectionStart:" + selectionStart + " startHashtag:" + start + " endHashtag:" + end, new Object[0]);
                        }
                        UploadView uploadView = this.f53443r;
                        Editable text2 = this.f53442q.getText();
                        AbstractC19074t.m100205c(matcher);
                        uploadView.m55055uL(text2, matcher);
                    }
                }
                if (!this.f53443r.f53430L0) {
                    InterfaceC19736t interfaceC19736t3 = this.f53443r.f53420B0;
                    if (interfaceC19736t3 == null) {
                        AbstractC19074t.m100223u("presenter");
                    } else {
                        interfaceC19736t = interfaceC19736t3;
                    }
                    interfaceC19736t.mo53493Ye();
                    this.f53443r.m55053sL();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadView$n */
    /* loaded from: classes5.dex */
    static final class C10504n extends AbstractC19075u implements InterfaceC18505l {
        C10504n() {
            super(1);
        }

        /* renamed from: a */
        public final void m55077a(Editable editable) {
            C25067x1 c25067x1 = UploadView.this.f53421C0;
            C25067x1 c25067x12 = null;
            if (c25067x1 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x1 = null;
            }
            SimpleShadowTextView simpleShadowTextView = c25067x1.f120411A;
            C25067x1 c25067x13 = UploadView.this.f53421C0;
            if (c25067x13 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25067x12 = c25067x13;
            }
            simpleShadowTextView.setText(c25067x12.f120415r.length() + "/300");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55077a((Editable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadView$o */
    /* loaded from: classes5.dex */
    static final class C10505o extends AbstractC19075u implements InterfaceC18494a {
        C10505o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float mo12V4() {
            return Float.valueOf(UploadView.this.m92651WI().getDimension(AbstractC27407b.zch_radius_8dp));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.UploadView$p */
    /* loaded from: classes5.dex */
    public static final class C10506p extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ConfirmPopupView f53446q;

        /* renamed from: r */
        final /* synthetic */ UploadView f53447r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10506p(ConfirmPopupView confirmPopupView, UploadView uploadView) {
            super(0);
            this.f53446q = confirmPopupView;
            this.f53447r = uploadView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55079a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55079a() {
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = this.f53446q.m92652XI(AbstractC27413h.zch_action_key_post_video_cancel_confirm);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C19205a.m100675M(c19205a, m92652XI, null, 2, null);
            this.f53447r.finish();
        }
    }

    public UploadView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C10505o());
        this.f53424F0 = m129210a;
        this.f53426H0 = Pattern.compile("#[a-zA-Z0-9_\\p{L}_\\p{N}]*");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AL */
    public final void m55032AL() {
        C19205a c19205a = C19205a.f95429a;
        String m92652XI = m92652XI(AbstractC27413h.zch_action_key_post_video_cancel);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        C19205a.m100675M(c19205a, m92652XI, null, 2, null);
        ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_page_upload_popup_title), Integer.valueOf(AbstractC27413h.zch_page_upload_popup_message), Integer.valueOf(AbstractC27413h.zch_page_upload_popup_positive_action), Integer.valueOf(AbstractC27413h.zch_page_upload_popup_negative_action), null, true, false, 80, null);
        m51992b.m51991lL(new C10506p(m51992b, this));
        C17487o0 m92649TI = m92649TI();
        AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
        m51992b.m51981cL(m92649TI, "dialog");
    }

    /* renamed from: BL */
    private final void m55033BL(String str) {
        if (this.f53421C0 == null) {
            return;
        }
        C23528a c23528a = this.f53423E0;
        C25067x1 c25067x1 = null;
        if (c23528a == null) {
            AbstractC19074t.m100223u("aQuery");
            c23528a = null;
        }
        C25067x1 c25067x12 = this.f53421C0;
        if (c25067x12 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25067x1 = c25067x12;
        }
        C23528a c23528a2 = (C23528a) c23528a.m123612r(c25067x1.f120418u);
        c23528a2.m123599d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m55034C() {
        C25067x1 c25067x1 = this.f53421C0;
        C25067x1 c25067x12 = null;
        if (c25067x1 == null) {
            AbstractC19074t.m100223u("binding");
            c25067x1 = null;
        }
        Object systemService = c25067x1.f120415r.getContext().getSystemService("input_method");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        C25067x1 c25067x13 = this.f53421C0;
        if (c25067x13 == null) {
            AbstractC19074t.m100223u("binding");
            c25067x13 = null;
        }
        if (c25067x13.f120415r.getWindowToken() != null) {
            C25067x1 c25067x14 = this.f53421C0;
            if (c25067x14 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25067x12 = c25067x14;
            }
            inputMethodManager.hideSoftInputFromWindow(c25067x12.f120415r.getWindowToken(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sL */
    public final void m55053sL() {
        C31161e0 c31161e0 = this.f53422D0;
        if (c31161e0 != null) {
            c31161e0.m151543R();
        }
        C25067x1 c25067x1 = this.f53421C0;
        if (c25067x1 == null) {
            AbstractC19074t.m100223u("binding");
            c25067x1 = null;
        }
        OverScrollableRecyclerView overScrollableRecyclerView = c25067x1.f120420w;
        AbstractC19074t.m100207e(overScrollableRecyclerView, "rv");
        AbstractC26112n.m134367H(overScrollableRecyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tL */
    public final void m55054tL(Editable editable) {
        if (editable != null) {
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) editable.getSpans(0, editable.length(), MetricAffectingSpan.class);
            AbstractC19074t.m100205c(metricAffectingSpanArr);
            for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                editable.removeSpan(metricAffectingSpan);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uL */
    public final void m55055uL(Editable editable, Matcher matcher) {
        if (editable != null) {
            editable.setSpan(new C10492b(), matcher.start(), matcher.end(), 33);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vL */
    public final float m55056vL() {
        return ((Number) this.f53424F0.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wL */
    public final void m55057wL() {
        C25067x1 c25067x1 = this.f53421C0;
        if (c25067x1 == null) {
            AbstractC19074t.m100223u("binding");
            c25067x1 = null;
        }
        c25067x1.f120415r.clearFocus();
        m55034C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xL */
    public static final void m55058xL(UploadView uploadView) {
        AbstractC19074t.m100208f(uploadView, "this$0");
        InterfaceC27218a m92676n2 = uploadView.m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(48);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yL */
    public static final void m55059yL(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zL */
    public static final void m55060zL(UploadView uploadView, View view) {
        AbstractC19074t.m100208f(uploadView, "this$0");
        uploadView.f53429K0 = !uploadView.f53429K0;
        C25067x1 c25067x1 = uploadView.f53421C0;
        if (c25067x1 == null) {
            AbstractC19074t.m100223u("binding");
            c25067x1 = null;
        }
        SwitchView switchView = c25067x1.f120422y;
        AbstractC19074t.m100207e(switchView, "swvAllowComment");
        SwitchView.m55812g(switchView, !uploadView.f53429K0, true, false, 4, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f53423E0 = new C23528a(getContext());
        this.f53420B0 = AbstractC28684a.Companion.m143674K();
        AbstractC1785o lifecycle = getLifecycle();
        InterfaceC19736t interfaceC19736t = this.f53420B0;
        if (interfaceC19736t == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19736t = null;
        }
        lifecycle.mo9335a(interfaceC19736t);
        InterfaceC19736t interfaceC19736t2 = this.f53420B0;
        if (interfaceC19736t2 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19736t2 = null;
        }
        interfaceC19736t2.mo52965Lb(this);
        InterfaceC19736t interfaceC19736t3 = this.f53420B0;
        if (interfaceC19736t3 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19736t3 = null;
        }
        interfaceC19736t3.mo52970uo(m92642L3());
        C31161e0 c31161e0 = new C31161e0(null, 1, null);
        c31161e0.m151552a0(false);
        c31161e0.m151550Y(new C10494d());
        this.f53422D0 = c31161e0;
    }

    @Override // m20.InterfaceC22811w1
    /* renamed from: Cs */
    public void mo55061Cs(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
    }

    @Override // m20.InterfaceC22811w1
    /* renamed from: IA */
    public void mo55062IA(String str, Section section) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(section, "completion");
        C25067x1 c25067x1 = null;
        if (!section.m51168m().isEmpty()) {
            C25067x1 c25067x12 = this.f53421C0;
            if (c25067x12 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25067x1 = c25067x12;
            }
            OverScrollableRecyclerView overScrollableRecyclerView = c25067x1.f120420w;
            AbstractC19074t.m100207e(overScrollableRecyclerView, "rv");
            AbstractC26112n.m134431w0(overScrollableRecyclerView);
        } else {
            C25067x1 c25067x13 = this.f53421C0;
            if (c25067x13 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25067x1 = c25067x13;
            }
            OverScrollableRecyclerView overScrollableRecyclerView2 = c25067x1.f120420w;
            AbstractC19074t.m100207e(overScrollableRecyclerView2, "rv");
            AbstractC26112n.m134367H(overScrollableRecyclerView2);
        }
        C31161e0 c31161e0 = this.f53422D0;
        if (c31161e0 != null) {
            c31161e0.m151551Z(section);
            c31161e0.m151547V(new C10493c());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        InterfaceC19736t interfaceC19736t = this.f53420B0;
        InterfaceC19736t interfaceC19736t2 = null;
        if (interfaceC19736t == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19736t = null;
        }
        interfaceC19736t.mo53492XB(m92642L3(), true);
        InterfaceC19736t interfaceC19736t3 = this.f53420B0;
        if (interfaceC19736t3 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC19736t2 = interfaceC19736t3;
        }
        m55033BL(interfaceC19736t2.mo53495xb());
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView
    /* renamed from: TK */
    public int mo54293TK() {
        return AbstractC27410e.zch_layout_upload;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C20196i c20196i = this.f53425G0;
        if (c20196i != null) {
            C20196i.m105317q(c20196i, null, 1, null);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        m55057wL();
        C20196i c20196i = this.f53425G0;
        if (c20196i != null) {
            c20196i.m105321s();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView
    /* renamed from: VK */
    public String mo54294VK() {
        String m92652XI = m92652XI(AbstractC27413h.zch_page_upload_video_title);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        return m92652XI;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        this.f53425G0 = new C20196i(this, false, new C10498h(), 2, null);
        m55011UK().getRoot().setOnClickListener(new View.OnClickListener() { // from class: m20.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UploadView.m55059yL(view2);
            }
        });
        ImageView imageView = m55011UK().f120342r.f119960r;
        AbstractC19074t.m100207e(imageView, "btnBack");
        AbstractC26112n.m134407k0(imageView, new C10499i());
        SimpleShadowTextView simpleShadowTextView = m55011UK().f120342r.f119959q;
        simpleShadowTextView.setText(m92652XI(AbstractC27413h.zch_page_upload_video_upload));
        AbstractC19074t.m100205c(simpleShadowTextView);
        AbstractC26112n.m134407k0(simpleShadowTextView, new C10500j());
        AbstractC26112n.m134391c0(simpleShadowTextView, AbstractC26112n.m134426u(simpleShadowTextView, AbstractC27406a.zch_control_active), simpleShadowTextView.getResources().getDimension(AbstractC27407b.zch_radius_4dp));
        AbstractC26112n.m134431w0(simpleShadowTextView);
        C25067x1 m129973a = C25067x1.m129973a(m55010SK());
        AbstractC19074t.m100207e(m129973a, "bind(...)");
        this.f53421C0 = m129973a;
        int i11 = m92689tK().getResources().getDisplayMetrics().widthPixels;
        C25067x1 c25067x1 = this.f53421C0;
        C25067x1 c25067x12 = null;
        if (c25067x1 == null) {
            AbstractC19074t.m100223u("binding");
            c25067x1 = null;
        }
        RoundedImageView roundedImageView = c25067x1.f120418u;
        AbstractC19074t.m100207e(roundedImageView, "ivThumb");
        ViewGroup.LayoutParams layoutParams = roundedImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i11 / 3;
            layoutParams.height = i11 / 2;
            roundedImageView.setLayoutParams(layoutParams);
            C25067x1 c25067x13 = this.f53421C0;
            if (c25067x13 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x13 = null;
            }
            c25067x13.f120418u.m55955j(m92651WI().getDimensionPixelSize(AbstractC27407b.zch_radius_6dp), RoundedImageView.EnumC10755b.f54377p);
            InterfaceC19736t interfaceC19736t = this.f53420B0;
            if (interfaceC19736t == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC19736t = null;
            }
            m55033BL(interfaceC19736t.mo53495xb());
            C25067x1 c25067x14 = this.f53421C0;
            if (c25067x14 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x14 = null;
            }
            RoundedImageView roundedImageView2 = c25067x14.f120418u;
            AbstractC19074t.m100207e(roundedImageView2, "ivThumb");
            AbstractC26112n.m134407k0(roundedImageView2, new C10501k());
            C25067x1 c25067x15 = this.f53421C0;
            if (c25067x15 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x15 = null;
            }
            RobotoButton robotoButton = c25067x15.f120414q;
            AbstractC19074t.m100207e(robotoButton, "btnSelect");
            AbstractC26112n.m134407k0(robotoButton, new C10502l());
            C25067x1 c25067x16 = this.f53421C0;
            if (c25067x16 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x16 = null;
            }
            NestedEditText nestedEditText = c25067x16.f120415r;
            nestedEditText.setShadowLayer(AbstractC26105g.m134346m(9.0f), 0.0f, AbstractC26105g.m134346m(-3.0f), 0);
            AbstractC19074t.m100205c(nestedEditText);
            AbstractC26112n.m134414o(nestedEditText, new C10503m(nestedEditText, this));
            AbstractC26112n.m134400h(nestedEditText, new C10504n());
            C25067x1 c25067x17 = this.f53421C0;
            if (c25067x17 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x17 = null;
            }
            RelativeLayout relativeLayout = c25067x17.f120419v;
            AbstractC19074t.m100205c(relativeLayout);
            AbstractC26112n.m134391c0(relativeLayout, AbstractC26112n.m134426u(relativeLayout, AbstractC27406a.zch_layer_background), m55056vL());
            C25067x1 c25067x18 = this.f53421C0;
            if (c25067x18 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x18 = null;
            }
            SimpleShadowTextView simpleShadowTextView2 = c25067x18.f120412B;
            AbstractC19074t.m100205c(simpleShadowTextView2);
            AbstractC26112n.m134407k0(simpleShadowTextView2, new C10495e());
            AbstractC26112n.m134391c0(simpleShadowTextView2, AbstractC26112n.m134426u(simpleShadowTextView2, AbstractC27406a.zch_icon_accent_gray_subtle), m55056vL() / 2);
            C25067x1 c25067x19 = this.f53421C0;
            if (c25067x19 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x19 = null;
            }
            OverScrollableRecyclerView overScrollableRecyclerView = c25067x19.f120420w;
            overScrollableRecyclerView.setOutlineProvider(new C10496f());
            overScrollableRecyclerView.setClipToOutline(true);
            overScrollableRecyclerView.setLayoutManager(new LinearLayoutManager(m92689tK()));
            overScrollableRecyclerView.setAdapter(this.f53422D0);
            AbstractC19074t.m100205c(overScrollableRecyclerView);
            AbstractC26112n.m134391c0(overScrollableRecyclerView, AbstractC26112n.m134426u(overScrollableRecyclerView, AbstractC27406a.zch_layer_background), m55056vL());
            C25067x1 c25067x110 = this.f53421C0;
            if (c25067x110 == null) {
                AbstractC19074t.m100223u("binding");
                c25067x110 = null;
            }
            FrameLayout frameLayout = c25067x110.f120417t;
            AbstractC19074t.m100207e(frameLayout, "flSuggest");
            AbstractC26112n.m134407k0(frameLayout, new C10497g());
            Channel m140377a = C27417l.f129055a.m140377a();
            if (m140377a != null && AbstractC19074t.m100204b(m140377a.m50720C(), Boolean.FALSE)) {
                C25067x1 c25067x111 = this.f53421C0;
                if (c25067x111 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25067x111 = null;
                }
                FrameLayout frameLayout2 = c25067x111.f120416s;
                AbstractC19074t.m100207e(frameLayout2, "flLockComment");
                AbstractC26112n.m134431w0(frameLayout2);
                C25067x1 c25067x112 = this.f53421C0;
                if (c25067x112 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25067x112 = null;
                }
                c25067x112.f120422y.setSwitchable(false);
                C25067x1 c25067x113 = this.f53421C0;
                if (c25067x113 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25067x113 = null;
                }
                SwitchView switchView = c25067x113.f120422y;
                AbstractC19074t.m100207e(switchView, "swvAllowComment");
                SwitchView.m55812g(switchView, !this.f53429K0, false, false, 6, null);
                C25067x1 c25067x114 = this.f53421C0;
                if (c25067x114 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c25067x12 = c25067x114;
                }
                c25067x12.f120416s.setOnClickListener(new View.OnClickListener() { // from class: m20.y1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        UploadView.m55060zL(UploadView.this, view2);
                    }
                });
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView
    /* renamed from: ZK */
    public boolean mo55014ZK() {
        return true;
    }

    @Override // m20.InterfaceC22811w1
    /* renamed from: aq */
    public boolean mo55063aq() {
        return this.f53429K0;
    }

    @Override // m20.InterfaceC22811w1
    /* renamed from: jr */
    public void mo55064jr(Throwable th2) {
        AbstractC19074t.m100208f(th2, C30268e.f140632a);
        C25097t.f120556a.m130155r(getContext(), th2);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (!m92649TI().m93029Q(ConfirmPopupView.class)) {
                m55032AL();
                return true;
            }
            ZaloView m92996E0 = m92649TI().m92996E0("dialog");
            if (m92996E0 instanceof ConfirmPopupView) {
                ((ConfirmPopupView) m92996E0).dismiss();
                return true;
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(48);
        }
        if (this.f53428J0) {
            this.f53428J0 = false;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: m20.z1
                @Override // java.lang.Runnable
                public final void run() {
                    UploadView.m55058xL(UploadView.this);
                }
            }, 500L);
        }
    }

    @Override // m20.InterfaceC22811w1
    /* renamed from: vz */
    public String mo55065vz() {
        C25067x1 c25067x1 = this.f53421C0;
        if (c25067x1 == null) {
            AbstractC19074t.m100223u("binding");
            c25067x1 = null;
        }
        return String.valueOf(c25067x1.f120415r.getText());
    }
}
