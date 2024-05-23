package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.widget.C13663l;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13804v0;
import com.zing.zalo.utils.ToastUtils;
import dj.C17945a0;
import dj.C18013y0;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.AbstractC23217t2;
import p361nb.AbstractC23647d;
import p394oj.C24278d;
import p716zh.C31840a7;
import p716zh.C31858ba;
import p716zh.C31948ha;
import p716zh.C32098s;
import p716zh.C32106s7;
import w50.C28769a;
import yf0.C30939f0;

/* loaded from: classes5.dex */
public abstract class ChatRowRecommendLinkBase extends ChatRowHasCaption implements C31840a7.f {

    /* renamed from: B7 */
    boolean f58488B7;

    /* renamed from: C7 */
    final C13697o f58489C7;

    /* renamed from: D7 */
    StaticLayout f58490D7;

    /* renamed from: E7 */
    int f58491E7;

    /* renamed from: F7 */
    int f58492F7;

    /* renamed from: G7 */
    StaticLayout f58493G7;

    /* renamed from: H7 */
    int f58494H7;

    /* renamed from: I7 */
    int f58495I7;

    /* renamed from: J7 */
    StaticLayout f58496J7;

    /* renamed from: K7 */
    int f58497K7;

    /* renamed from: L7 */
    int f58498L7;

    /* renamed from: M7 */
    int f58499M7;

    /* renamed from: N7 */
    String f58500N7;

    /* renamed from: O7 */
    String f58501O7;

    /* renamed from: P7 */
    C32106s7 f58502P7;

    /* renamed from: Q7 */
    MessageId f58503Q7;

    /* renamed from: R7 */
    boolean f58504R7;

    /* renamed from: S7 */
    final C13804v0 f58505S7;

    /* renamed from: T7 */
    boolean f58506T7;

    /* renamed from: U7 */
    int f58507U7;

    /* renamed from: V7 */
    int f58508V7;

    /* renamed from: W7 */
    final C13663l f58509W7;

    /* renamed from: X7 */
    int f58510X7;

    /* renamed from: Y7 */
    int f58511Y7;

    /* renamed from: Z7 */
    boolean f58512Z7;

    /* renamed from: a8 */
    int f58513a8;

    public ChatRowRecommendLinkBase(Context context) {
        super(context);
        this.f58500N7 = "";
        this.f58501O7 = "";
        this.f58512Z7 = false;
        this.f58513a8 = 0;
        this.f58489C7 = new C13697o(this);
        this.f58505S7 = new C13804v0(this);
        C13663l c13663l = new C13663l(this);
        this.f58509W7 = c13663l;
        c13663l.m76418n(1, AbstractC23136l9.m118742r(16.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C4 */
    public /* synthetic */ void m61614C4(String str) {
        try {
            this.f58504R7 = false;
            this.f58506T7 = false;
            if (isAttachedToWindow() && this.f57263B.m95135f9(this.f58503Q7)) {
                invalidate();
                if (!TextUtils.isEmpty(str)) {
                    m61618D4(str);
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A4 */
    public void m61616A4(boolean z11) {
        try {
            int i11 = this.f58499M7;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 4 && this.f58502P7 != null) {
                        InterfaceC11530v delegate = getDelegate();
                        C32106s7 c32106s7 = this.f58502P7;
                        delegate.mo62044I4(this, c32106s7, c32106s7.m154978g());
                        return;
                    }
                } else {
                    if (z11 && !TextUtils.isEmpty(this.f58500N7)) {
                        AbstractC23647d.m123897g("10006300");
                        if (!this.f58504R7) {
                            C24278d m152978f = C31840a7.m152973c().m152978f(this.f58500N7);
                            if (m152978f != null && !m152978f.m126783a()) {
                                m61618D4(m152978f.f117250c);
                                return;
                            }
                            m61622z4(this.f58500N7);
                            return;
                        }
                        return;
                    }
                    AbstractC23647d.m123906p("10006301");
                }
            } else {
                if (z11 && !TextUtils.isEmpty(this.f58501O7)) {
                    AbstractC23647d.m123897g("10006300");
                    C31948ha.m153587d().m153589b(C31858ba.m153144a(this.f57263B));
                    return;
                }
                AbstractC23647d.m123906p("10006301");
            }
            if (!TextUtils.isEmpty(this.f57263B.m94929K2().f91014s)) {
                getDelegate().mo62051K4(this, this.f57263B.m94929K2().f91014s);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B4 */
    protected boolean m61617B4() {
        int i11;
        return this.f58488B7 && ((i11 = this.f58499M7) == 1 || i11 == 3 || i11 == 2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        super.mo60953C3(c17945a0, c28769a, z11);
        if (z11) {
            this.f58504R7 = false;
            this.f58506T7 = false;
        }
        m61619E4(c17945a0);
    }

    /* renamed from: D4 */
    void m61618D4(String str) {
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && c17945a0.m94929K2() != null && (this.f57263B.m94929K2() instanceof C18013y0)) {
            C31858ba c31858ba = new C31858ba();
            C18013y0 c18013y0 = (C18013y0) this.f57263B.m94929K2();
            c31858ba.f146284a = this.f57263B.m95029V3();
            c31858ba.f146285b = str;
            C32098s c32098s = c18013y0.f91251B;
            String str2 = c32098s.f147953c;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            c31858ba.f146287d = str2;
            String str4 = c32098s.f147957g;
            if (str4 == null) {
                str4 = "";
            }
            c31858ba.f146286c = str4;
            String str5 = c32098s.f147960j;
            if (str5 != null) {
                str3 = str5;
            }
            c31858ba.f146289f = str3;
            C31948ha.m153587d().m153589b(c31858ba);
        }
    }

    /* renamed from: E4 */
    public void m61619E4(C17945a0 c17945a0) {
        if (c17945a0.m94929K2() != null) {
            String str = c17945a0.m94929K2().f91014s;
            if (!TextUtils.isEmpty(str)) {
                C30939f0.Companion.m150482h(getContext(), str, null);
            }
        }
    }

    /* renamed from: F4 */
    void m61620F4() {
        boolean z11;
        try {
            C31858ba m153591e = C31948ha.m153587d().m153591e();
            if (m153591e != null && Objects.equals(m153591e.f146284a, this.f57263B.m95029V3()) && C31948ha.m153587d().m153595i()) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f58512Z7 = z11;
            if (z11) {
                this.f58513a8 = C31948ha.m153587d().m153592f();
            } else {
                this.f58513a8 = 0;
            }
            this.f58509W7.m76349t(this.f58512Z7);
            if (this.f58512Z7) {
                this.f58509W7.m76416k(this.f58513a8);
            } else {
                this.f58509W7.m76415j();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N2 */
    protected void mo60995N2() {
        try {
            m61616A4(true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O3 */
    protected boolean mo61001O3() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        int i11 = this.f58499M7;
        if (i11 == 1 || i11 == 3) {
            m61620F4();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:4:0x0006, B:8:0x0010, B:12:0x004a, B:15:0x0080, B:19:0x0086, B:21:0x008a, B:23:0x0090, B:25:0x0096, B:27:0x00a0, B:29:0x00a6, B:36:0x0050, B:38:0x0054, B:40:0x005c, B:42:0x0062, B:44:0x006c, B:46:0x0072, B:48:0x001a, B:50:0x001e, B:52:0x0026, B:54:0x002c, B:56:0x0036, B:58:0x003c), top: B:3:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0054 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:4:0x0006, B:8:0x0010, B:12:0x004a, B:15:0x0080, B:19:0x0086, B:21:0x008a, B:23:0x0090, B:25:0x0096, B:27:0x00a0, B:29:0x00a6, B:36:0x0050, B:38:0x0054, B:40:0x005c, B:42:0x0062, B:44:0x006c, B:46:0x0072, B:48:0x001a, B:50:0x001e, B:52:0x0026, B:54:0x002c, B:56:0x0036, B:58:0x003c), top: B:3:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0059  */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: a4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List mo61270a4(List list) {
        CharSequence charSequence;
        ArrayList m119662n;
        StaticLayout staticLayout;
        CharSequence charSequence2;
        ArrayList m119662n2;
        StaticLayout staticLayout2;
        ArrayList m119662n3;
        List mo61270a4 = super.mo61270a4(list);
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    CharSequence charSequence3 = "";
                    if (mo61270a4 != null) {
                        if (mo61270a4.isEmpty()) {
                        }
                        if (mo61270a4 != null || mo61270a4.isEmpty()) {
                            staticLayout = this.f58493G7;
                            if (staticLayout != null) {
                                charSequence2 = "";
                            } else {
                                charSequence2 = staticLayout.getText();
                            }
                            if (staticLayout != null && !TextUtils.isEmpty(charSequence2) && (m119662n2 = AbstractC23217t2.m119662n(charSequence2.toString(), list)) != null && !m119662n2.isEmpty()) {
                                mo61270a4 = AbstractC23214t.m119614a(m119662n2, staticLayout, charSequence2.length(), this.f58494H7, this.f58495I7);
                            }
                        }
                        if (mo61270a4 != null || mo61270a4.isEmpty()) {
                            staticLayout2 = this.f58496J7;
                            if (staticLayout2 != null) {
                                charSequence3 = staticLayout2.getText();
                            }
                            if (charSequence3 == null && !TextUtils.isEmpty(charSequence3) && (m119662n3 = AbstractC23217t2.m119662n(charSequence3.toString(), list)) != null && !m119662n3.isEmpty()) {
                                return AbstractC23214t.m119614a(m119662n3, staticLayout2, charSequence3.length(), this.f58497K7, this.f58498L7);
                            }
                            return mo61270a4;
                        }
                        return mo61270a4;
                    }
                    StaticLayout staticLayout3 = this.f58490D7;
                    if (staticLayout3 == null) {
                        charSequence = "";
                    } else {
                        charSequence = staticLayout3.getText();
                    }
                    if (staticLayout3 != null && !TextUtils.isEmpty(charSequence) && (m119662n = AbstractC23217t2.m119662n(charSequence.toString(), list)) != null && !m119662n.isEmpty()) {
                        mo61270a4 = AbstractC23214t.m119614a(m119662n, staticLayout3, charSequence.length(), this.f58491E7, this.f58492F7);
                    }
                    if (mo61270a4 != null) {
                    }
                    staticLayout = this.f58493G7;
                    if (staticLayout != null) {
                    }
                    if (staticLayout != null) {
                        mo61270a4 = AbstractC23214t.m119614a(m119662n2, staticLayout, charSequence2.length(), this.f58494H7, this.f58495I7);
                    }
                    if (mo61270a4 != null) {
                    }
                    staticLayout2 = this.f58496J7;
                    if (staticLayout2 != null) {
                    }
                    return charSequence3 == null ? mo61270a4 : mo61270a4;
                }
                return mo61270a4;
            } catch (Exception e11) {
                e11.printStackTrace();
                return mo61270a4;
            }
        }
        return mo61270a4;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: b4 */
    protected boolean mo61424b4() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: e2 */
    public void mo61055e2(int i11, int i12, int i13, int i14, boolean z11) {
        super.mo61055e2(i11, i12, i13, i14, z11);
        if (this.f58488B7) {
            this.f58510X7 = this.f58489C7.m76469h() + ((this.f58489C7.m76473l() - this.f58509W7.m76348s()) / 2);
            this.f58511Y7 = this.f58489C7.m76471j() + ((this.f58489C7.m76472k() - this.f58509W7.m76347r()) / 2);
            this.f58507U7 = this.f58489C7.m76469h() + ((this.f58489C7.m76473l() - this.f58505S7.m77064c()) / 2);
            this.f58508V7 = this.f58489C7.m76471j() + ((this.f58489C7.m76473l() - this.f58505S7.m77063b()) / 2);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        String msgContentTalkText = super.getMsgContentTalkText();
        try {
            if (this.f58490D7 != null) {
                msgContentTalkText = msgContentTalkText + ((Object) this.f58490D7.getText());
            }
            if (this.f58493G7 != null) {
                return msgContentTalkText + ((Object) this.f58493G7.getText());
            }
            return msgContentTalkText;
        } catch (Exception e11) {
            e11.printStackTrace();
            return msgContentTalkText;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getPhotoCoords() {
        if (this.f58488B7) {
            Rect rect = new Rect();
            int[] iArr = new int[2];
            this.f57560z4.getLocationOnScreen(iArr);
            rect.left = this.f58489C7.m76469h();
            rect.top = iArr[1] + this.f58489C7.m76471j();
            rect.right = rect.left + this.f58489C7.m76473l();
            rect.bottom = rect.top + this.f58489C7.m76472k();
            return rect;
        }
        return null;
    }

    @Override // p716zh.C31840a7.f
    /* renamed from: i */
    public void mo61621i(final String str) {
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.t0
            @Override // java.lang.Runnable
            public final void run() {
                ChatRowRecommendLinkBase.this.m61614C4(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: r0 */
    public void mo61107r0(Canvas canvas) {
        super.mo61107r0(canvas);
        if (this.f58506T7) {
            this.f58505S7.m77067f(this.f58507U7, this.f58508V7);
            this.f58505S7.m77062a(canvas);
        } else if (m61617B4()) {
            canvas.save();
            canvas.translate(this.f58510X7, this.f58511Y7);
            this.f58509W7.m76410b(canvas);
            canvas.restore();
        }
    }

    /* renamed from: z4 */
    void m61622z4(String str) {
        this.f58504R7 = true;
        this.f58503Q7 = this.f57263B.m95029V3();
        this.f58506T7 = true;
        C31840a7.m152973c().m152975b(str, this);
    }
}
