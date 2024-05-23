package p716zh;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.core.util.InterfaceC1488j;
import androidx.core.view.C1538d;
import androidx.core.view.InterfaceC1555h0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;

/* renamed from: zh.z8 */
/* loaded from: classes3.dex */
public final class C32205z8 implements InterfaceC1555h0 {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static final String[] f148548b = {"text/*", "image/png", "image/*", "video/*", "application/*"};

    /* renamed from: a */
    private final b f148549a;

    /* renamed from: zh.z8$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String[] m155302a() {
            return C32205z8.f148548b;
        }
    }

    /* renamed from: zh.z8$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: Jm */
        boolean mo64111Jm();

        /* renamed from: Vk */
        void mo64138Vk(CharSequence charSequence, int i11);

        /* renamed from: Xf */
        void mo64142Xf(c cVar, ClipDescription clipDescription, Bundle bundle, int i11);

        /* renamed from: q4 */
        void mo64180q4(c cVar);

        /* renamed from: s4 */
        void mo64185s4(c cVar);
    }

    /* renamed from: zh.z8$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private final Uri f148550a;

        /* renamed from: b */
        private final String f148551b;

        /* renamed from: c */
        private final C1538d f148552c;

        public c(Uri uri, String str, C1538d c1538d) {
            AbstractC19074t.m100208f(uri, "uri");
            AbstractC19074t.m100208f(str, "mimeType");
            this.f148550a = uri;
            this.f148551b = str;
            this.f148552c = c1538d;
        }

        /* renamed from: a */
        public final String m155303a() {
            return this.f148551b;
        }

        /* renamed from: b */
        public final Uri m155304b() {
            return this.f148550a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC19074t.m100204b(this.f148550a, cVar.f148550a) && AbstractC19074t.m100204b(this.f148551b, cVar.f148551b) && AbstractC19074t.m100204b(this.f148552c, cVar.f148552c);
        }

        public int hashCode() {
            int hashCode = ((this.f148550a.hashCode() * 31) + this.f148551b.hashCode()) * 31;
            C1538d c1538d = this.f148552c;
            return hashCode + (c1538d == null ? 0 : c1538d.hashCode());
        }

        public String toString() {
            String uri = this.f148550a.toString();
            AbstractC19074t.m100207e(uri, "toString(...)");
            return uri;
        }
    }

    public C32205z8(b bVar) {
        AbstractC19074t.m100208f(bVar, "delegate");
        this.f148549a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m155300e(ClipData.Item item) {
        CharSequence text = item.getText();
        if ((text != null && text.length() != 0) || item.getUri() != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.InterfaceC1555h0
    /* renamed from: a */
    public C1538d mo7772a(View view, C1538d c1538d) {
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(c1538d, "payload");
        Pair m7741i = c1538d.m7741i(new InterfaceC1488j() { // from class: zh.y8
            @Override // androidx.core.util.InterfaceC1488j
            /* renamed from: a */
            public final boolean mo7496a(Object obj) {
                boolean m155300e;
                m155300e = C32205z8.m155300e((ClipData.Item) obj);
                return m155300e;
            }
        });
        AbstractC19074t.m100207e(m7741i, "partition(...)");
        C1538d c1538d2 = (C1538d) m7741i.first;
        C1538d c1538d3 = (C1538d) m7741i.second;
        ClipData m7736c = c1538d2.m7736c();
        AbstractC19074t.m100207e(m7736c, "getClip(...)");
        Bundle m7737d = c1538d2.m7737d();
        int m7740g = c1538d2.m7740g();
        if (m7740g == 1) {
            return c1538d;
        }
        if (this.f148549a.mo64111Jm()) {
            m155301d(m7736c, m7740g, m7737d, c1538d);
        }
        return c1538d3;
    }

    /* renamed from: d */
    public final void m155301d(ClipData clipData, int i11, Bundle bundle, C1538d c1538d) {
        ClipData.Item item;
        String str;
        Uri uri;
        AbstractC19074t.m100208f(clipData, "clipData");
        ClipDescription description = clipData.getDescription();
        CharSequence charSequence = null;
        if (clipData.getItemCount() > 0) {
            item = clipData.getItemAt(0);
        } else {
            item = null;
        }
        CharSequence charSequence2 = "";
        if (description.getMimeTypeCount() <= 0) {
            str = "";
        } else {
            str = description.getMimeType(0);
        }
        if (item != null) {
            uri = item.getUri();
        } else {
            uri = null;
        }
        if (uri == null) {
            b bVar = this.f148549a;
            if (item != null) {
                charSequence = item.getText();
            }
            if (charSequence != null) {
                charSequence2 = charSequence;
            }
            bVar.mo64138Vk(charSequence2, i11);
            return;
        }
        AbstractC19074t.m100205c(str);
        c cVar = new c(uri, str, c1538d);
        ClipboardManagerOnPrimaryClipChangedListenerC23245w clipboardManagerOnPrimaryClipChangedListenerC23245w = ClipboardManagerOnPrimaryClipChangedListenerC23245w.f112633a;
        if (clipboardManagerOnPrimaryClipChangedListenerC23245w.m119776m(cVar)) {
            this.f148549a.mo64142Xf(cVar, description, bundle, i11);
        } else if (clipboardManagerOnPrimaryClipChangedListenerC23245w.m119777n(cVar)) {
            this.f148549a.mo64185s4(cVar);
        } else {
            this.f148549a.mo64180q4(cVar);
        }
    }
}
