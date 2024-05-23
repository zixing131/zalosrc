package com.zing.zalo.feed.mvp.profile.model;

import android.os.Parcelable;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import pm0.C24848g0;
import un0.AbstractC27323a;
import un0.AbstractC27336n;
import un0.C27326d;

/* loaded from: classes4.dex */
public interface ProfileAlbumThemeCollection extends Parcelable {
    public static final C8667a Companion = C8667a.f46704a;

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.ProfileAlbumThemeCollection$a */
    /* loaded from: classes4.dex */
    public static final class C8667a {

        /* renamed from: a */
        static final /* synthetic */ C8667a f46704a = new C8667a();

        /* renamed from: b */
        private static final AbstractC27323a f46705b = AbstractC27336n.m139941b(null, a.f46706q, 1, null);

        /* renamed from: com.zing.zalo.feed.mvp.profile.model.ProfileAlbumThemeCollection$a$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f46706q = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m46315a(C27326d c27326d) {
                AbstractC19074t.m100208f(c27326d, "$this$Json");
                c27326d.m139881f(true);
                c27326d.m139878c(true);
                c27326d.m139882g(true);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m46315a((C27326d) obj);
                return C24848g0.f119245a;
            }
        }

        private C8667a() {
        }

        /* renamed from: a */
        public final ProfileAlbumThemeCollection m46313a() {
            return new ProfileAlbumThemeCollectionImpl((List) null, 1, (AbstractC19060k) null);
        }

        /* renamed from: b */
        public final ProfileAlbumThemeCollection m46314b(String str) {
            AbstractC19074t.m100208f(str, "data");
            AbstractC27323a abstractC27323a = f46705b;
            abstractC27323a.mo131586a();
            return (ProfileAlbumThemeCollection) abstractC27323a.m139867d(ProfileAlbumThemeCollectionImpl.Companion.serializer(), str);
        }
    }

    ThemeItem getTheme(int i11);

    List getThemes();

    ThemeItem randomizeTheme();
}
