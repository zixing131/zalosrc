package com.zing.zalo.feed.reactions.p065ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.feed.uicontrols.suggestcomment.SuggestCommentView;
import fn0.AbstractC19074t;
import java.util.List;
import p649xl.C30072ud;
import p691yr.AbstractC31062l;
import p691yr.AbstractC31064n;
import p691yr.C31063m;
import qm0.AbstractC25368s;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes4.dex */
public final class TimelineFeedCommentButton extends FrameLayout {

    /* renamed from: p */
    private final C30072ud f47292p;

    /* renamed from: q */
    private EnumC8850a f47293q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.feed.reactions.ui.TimelineFeedCommentButton$a */
    /* loaded from: classes4.dex */
    public static final class EnumC8850a {

        /* renamed from: p */
        public static final EnumC8850a f47294p = new EnumC8850a("MINI", 0);

        /* renamed from: q */
        public static final EnumC8850a f47295q = new EnumC8850a("FULL", 1);

        /* renamed from: r */
        private static final /* synthetic */ EnumC8850a[] f47296r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f47297s;

        static {
            EnumC8850a[] m47281b = m47281b();
            f47296r = m47281b;
            f47297s = AbstractC30166b.m148796a(m47281b);
        }

        private EnumC8850a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC8850a[] m47281b() {
            return new EnumC8850a[]{f47294p, f47295q};
        }

        public static EnumC8850a valueOf(String str) {
            return (EnumC8850a) Enum.valueOf(EnumC8850a.class, str);
        }

        public static EnumC8850a[] values() {
            return (EnumC8850a[]) f47296r.clone();
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.ui.TimelineFeedCommentButton$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8851b {
    }

    /* renamed from: com.zing.zalo.feed.reactions.ui.TimelineFeedCommentButton$c */
    /* loaded from: classes4.dex */
    public static final class C8852c implements InterfaceC8851b {

        /* renamed from: a */
        private final List f47298a;

        /* renamed from: b */
        private final String f47299b;

        /* renamed from: c */
        private final boolean f47300c;

        /* renamed from: d */
        private final C3020p0 f47301d;

        /* renamed from: e */
        private final C3000l0 f47302e;

        public C8852c(List list, String str, boolean z11, C3020p0 c3020p0, C3000l0 c3000l0) {
            AbstractC19074t.m100208f(list, "listSuggestComment");
            AbstractC19074t.m100208f(str, "feedId");
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            AbstractC19074t.m100208f(c3000l0, "feedContent");
            this.f47298a = list;
            this.f47299b = str;
            this.f47300c = z11;
            this.f47301d = c3020p0;
            this.f47302e = c3000l0;
        }

        /* renamed from: a */
        public final C3000l0 m47282a() {
            return this.f47302e;
        }

        /* renamed from: b */
        public final String m47283b() {
            return this.f47299b;
        }

        /* renamed from: c */
        public final C3020p0 m47284c() {
            return this.f47301d;
        }

        /* renamed from: d */
        public final List m47285d() {
            return this.f47298a;
        }

        /* renamed from: e */
        public final boolean m47286e() {
            return this.f47300c;
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.ui.TimelineFeedCommentButton$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C8853d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47303a;

        static {
            int[] iArr = new int[EnumC8850a.values().length];
            try {
                iArr[EnumC8850a.f47294p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8850a.f47295q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f47303a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineFeedCommentButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attributeSet");
        C30072ud m148589c = C30072ud.m148589c(LayoutInflater.from(getContext()), this, true);
        AbstractC19074t.m100207e(m148589c, "inflate(...)");
        this.f47292p = m148589c;
        this.f47293q = EnumC8850a.f47294p;
        C31063m c31063m = C31063m.f143208a;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        AbstractC31062l m150961a = c31063m.m150961a(context2, C31063m.a.f143211q);
        m148589c.f139604r.setBackground(AbstractC31064n.m150965a(m150961a));
        m148589c.f139603q.setImageDrawable(m150961a.m150959c());
        m148589c.f139605s.setMode(10);
        m148589c.f139605s.setShowInput(false);
        m148589c.f139605s.setVisibility(8);
    }

    /* renamed from: a */
    private final void m47278a(InterfaceC8851b interfaceC8851b) {
        List m131502j;
        this.f47292p.f139605s.setShowInput(true);
        if (interfaceC8851b instanceof C8852c) {
            C8852c c8852c = (C8852c) interfaceC8851b;
            this.f47292p.f139605s.m47448k(c8852c.m47285d(), c8852c.m47283b(), c8852c.m47286e(), c8852c.m47284c(), c8852c.m47282a());
        } else {
            SuggestCommentView suggestCommentView = this.f47292p.f139605s;
            m131502j = AbstractC25368s.m131502j();
            suggestCommentView.m47448k(m131502j, "", false, new C3020p0(), new C3000l0());
        }
        this.f47292p.f139605s.setVisibility(0);
        this.f47292p.f139604r.setVisibility(8);
    }

    /* renamed from: b */
    private final void m47279b() {
        this.f47292p.f139604r.setVisibility(0);
        this.f47292p.f139605s.setVisibility(8);
    }

    /* renamed from: c */
    public final void m47280c(EnumC8850a enumC8850a, InterfaceC8851b interfaceC8851b) {
        AbstractC19074t.m100208f(enumC8850a, "displayMode");
        int i11 = C8853d.f47303a[enumC8850a.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                m47278a(interfaceC8851b);
            }
        } else {
            m47279b();
        }
        this.f47293q = enumC8850a;
    }

    public final SuggestCommentView getCommentBarView() {
        SuggestCommentView suggestCommentView = this.f47292p.f139605s;
        AbstractC19074t.m100207e(suggestCommentView, "commentBar");
        return suggestCommentView;
    }

    public final View getCommentButtonMini() {
        RelativeLayout relativeLayout = this.f47292p.f139604r;
        AbstractC19074t.m100207e(relativeLayout, "btnCommentMini");
        return relativeLayout;
    }
}
