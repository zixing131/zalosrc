package com.zing.zalo.feed.reactions.p065ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import fn0.AbstractC19074t;
import p649xl.C29957o3;
import p691yr.AbstractC31062l;
import p691yr.AbstractC31064n;
import p691yr.C31063m;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes4.dex */
public final class FeedCommentButton extends FrameLayout {

    /* renamed from: p */
    private final C29957o3 f47287p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.feed.reactions.ui.FeedCommentButton$a */
    /* loaded from: classes4.dex */
    public static final class EnumC8849a {

        /* renamed from: p */
        public static final EnumC8849a f47288p = new EnumC8849a("MINI", 0);

        /* renamed from: q */
        public static final EnumC8849a f47289q = new EnumC8849a("FULL", 1);

        /* renamed from: r */
        private static final /* synthetic */ EnumC8849a[] f47290r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f47291s;

        static {
            EnumC8849a[] m47277b = m47277b();
            f47290r = m47277b;
            f47291s = AbstractC30166b.m148796a(m47277b);
        }

        private EnumC8849a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC8849a[] m47277b() {
            return new EnumC8849a[]{f47288p, f47289q};
        }

        public static EnumC8849a valueOf(String str) {
            return (EnumC8849a) Enum.valueOf(EnumC8849a.class, str);
        }

        public static EnumC8849a[] values() {
            return (EnumC8849a[]) f47290r.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedCommentButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attributeSet");
        C29957o3 m148308c = C29957o3.m148308c(LayoutInflater.from(getContext()), this, true);
        AbstractC19074t.m100207e(m148308c, "inflate(...)");
        this.f47287p = m148308c;
        m148308c.f138854s.setVisibility(0);
        m148308c.f138852q.setVisibility(8);
        C31063m c31063m = C31063m.f143208a;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        AbstractC31062l m150961a = c31063m.m150961a(context2, C31063m.a.f143211q);
        m148308c.f138854s.setBackground(AbstractC31064n.m150965a(m150961a));
        m148308c.f138853r.setImageDrawable(m150961a.m150959c());
    }

    public final void setDisplayMode(EnumC8849a enumC8849a) {
        AbstractC19074t.m100208f(enumC8849a, "displayMode");
        if (enumC8849a == EnumC8849a.f47288p) {
            this.f47287p.f138854s.setVisibility(0);
            this.f47287p.f138852q.setVisibility(8);
        } else if (enumC8849a == EnumC8849a.f47289q) {
            this.f47287p.f138854s.setVisibility(8);
            this.f47287p.f138852q.setVisibility(0);
        }
    }
}
