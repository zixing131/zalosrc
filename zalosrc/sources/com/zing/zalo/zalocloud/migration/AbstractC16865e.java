package com.zing.zalo.zalocloud.migration;

import com.zing.zalo.zalocloud.migration.AbstractC16864d;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.NoWhenBranchMatchedException;
import p487rl.C25822c;
import s00.AbstractC26080o;
import ug0.EnumC27248c;
import ug0.EnumC27249d;

/* renamed from: com.zing.zalo.zalocloud.migration.e */
/* loaded from: classes7.dex */
public abstract class AbstractC16865e {

    /* renamed from: com.zing.zalo.zalocloud.migration.e$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f85825a;

        static {
            int[] iArr = new int[EnumC27248c.values().length];
            try {
                iArr[EnumC27248c.f128035p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27248c.f128036q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC27248c.f128037r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC27248c.f128038s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f85825a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.e$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final b f85826q = new b();

        /* renamed from: com.zing.zalo.zalocloud.migration.e$b$a */
        /* loaded from: classes7.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f85827a;

            static {
                int[] iArr = new int[EnumC27249d.values().length];
                try {
                    iArr[EnumC27249d.f128041p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC27249d.f128042q.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC27249d.f128043r.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC27249d.f128044s.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f85827a = iArr;
            }
        }

        b() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo205i9(EnumC27249d enumC27249d) {
            int i11;
            AbstractC19074t.m100208f(enumC27249d, "it");
            int i12 = a.f85827a[enumC27249d.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            i11 = ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        i11 = ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM;
                    }
                } else {
                    i11 = 20000;
                }
            } else {
                i11 = 10000;
            }
            return Integer.valueOf(i11);
        }
    }

    /* renamed from: a */
    public static final C25822c m90098a(AbstractC16864d abstractC16864d) {
        int i11;
        int i12;
        int intValue;
        int i13;
        AbstractC19074t.m100208f(abstractC16864d, "<this>");
        b bVar = b.f85826q;
        if (abstractC16864d instanceof AbstractC16864d.k) {
            i11 = 0;
        } else if (abstractC16864d instanceof AbstractC16864d.h) {
            i11 = 1000;
        } else {
            if (abstractC16864d instanceof AbstractC16864d.e) {
                AbstractC16864d.e eVar = (AbstractC16864d.e) abstractC16864d;
                int i14 = a.f85825a[eVar.m90094l().ordinal()];
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                i12 = 3003;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            i12 = 3002;
                        }
                    } else {
                        i12 = 3001;
                    }
                } else {
                    i12 = 3000;
                }
                intValue = ((Number) bVar.mo205i9(eVar.m90093k())).intValue();
            } else if (abstractC16864d instanceof AbstractC16864d.f) {
                AbstractC16864d.f fVar = (AbstractC16864d.f) abstractC16864d;
                if (fVar.m90096k()) {
                    i12 = ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4;
                } else {
                    i12 = ZAbstractBase.ZVU_PROCESS_FLUSH;
                }
                intValue = ((Number) bVar.mo205i9(fVar.m90095j())).intValue();
            } else if (abstractC16864d instanceof AbstractC16864d.g) {
                i11 = 4000;
            } else if (abstractC16864d instanceof AbstractC16864d.j) {
                i11 = AbstractC26080o.a.f124275b;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            i13 = intValue;
            i11 = i12;
            return new C25822c(abstractC16864d.m90088i(), i11, i13, (int) (abstractC16864d.mo90080a() * 100), System.currentTimeMillis());
        }
        i13 = 0;
        return new C25822c(abstractC16864d.m90088i(), i11, i13, (int) (abstractC16864d.mo90080a() * 100), System.currentTimeMillis());
    }

    /* renamed from: b */
    public static final AbstractC16864d m90099b(C25822c c25822c) {
        EnumC27249d enumC27249d;
        AbstractC19074t.m100208f(c25822c, "<this>");
        int m133170b = c25822c.m133170b();
        if (m133170b != 10000) {
            switch (m133170b) {
                case 20000:
                    enumC27249d = EnumC27249d.f128042q;
                    break;
                case ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM /* 20001 */:
                    enumC27249d = EnumC27249d.f128043r;
                    break;
                case ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM /* 20002 */:
                    enumC27249d = EnumC27249d.f128044s;
                    break;
                default:
                    enumC27249d = EnumC27249d.f128043r;
                    break;
            }
        } else {
            enumC27249d = EnumC27249d.f128041p;
        }
        EnumC27249d enumC27249d2 = enumC27249d;
        int m133172d = c25822c.m133172d();
        if (m133172d != 0) {
            if (m133172d != 1000) {
                if (m133172d != 4000) {
                    if (m133172d != 5000) {
                        if (m133172d != 2000) {
                            if (m133172d != 2001) {
                                switch (m133172d) {
                                    case 3000:
                                        return new AbstractC16864d.a(c25822c.m133169a(), enumC27249d2, AbstractC16864d.Companion.m90091c(enumC27249d2, c25822c.m133171c() / 100.0f));
                                    case 3001:
                                        return new AbstractC16864d.d(c25822c.m133169a(), enumC27249d2, AbstractC16864d.Companion.m90091c(enumC27249d2, c25822c.m133171c() / 100.0f));
                                    case 3002:
                                        return new AbstractC16864d.c(c25822c.m133169a(), enumC27249d2, AbstractC16864d.Companion.m90091c(enumC27249d2, c25822c.m133171c() / 100.0f));
                                    case 3003:
                                        return new AbstractC16864d.i(c25822c.m133169a(), enumC27249d2, AbstractC16864d.Companion.m90091c(enumC27249d2, c25822c.m133171c() / 100.0f));
                                    default:
                                        throw new IllegalArgumentException("Invalid migrate state log id=" + c25822c.m133169a() + ", state=" + c25822c.m133172d());
                                }
                            }
                            return new AbstractC16864d.f(c25822c.m133169a(), enumC27249d2, 0, 0, AbstractC16864d.Companion.m90091c(enumC27249d2, c25822c.m133171c() / 100.0f), true);
                        }
                        return new AbstractC16864d.f(c25822c.m133169a(), enumC27249d2, 0, 0, AbstractC16864d.Companion.m90091c(enumC27249d2, c25822c.m133171c() / 100.0f), false, 32, null);
                    }
                    return new AbstractC16864d.j(c25822c.m133169a());
                }
                return new AbstractC16864d.g(c25822c.m133169a(), enumC27249d2, AbstractC16864d.Companion.m90091c(enumC27249d2, c25822c.m133171c() / 100.0f), false, 8, null);
            }
            return new AbstractC16864d.h(c25822c.m133169a());
        }
        return new AbstractC16864d.k(c25822c.m133169a());
    }
}
