package p330lp;

import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19074t;
import is.AbstractC20814p0;
import me0.AbstractC23136l9;

/* renamed from: lp.d */
/* loaded from: classes4.dex */
public final class C22636d {
    /* renamed from: a */
    public final String m117196a(int i11, int i12) {
        String quantityString;
        if (i11 > 0) {
            String m108599D = AbstractC20814p0.m108599D(i11);
            AbstractC19074t.m100207e(m108599D, "getCountByKString(...)");
            if (i12 != 0 && i12 != 1) {
                quantityString = AbstractC23136l9.m118698c0().getQuantityString(AbstractC7921d0.str_reaction_like_comment_count, i11, m108599D);
            } else {
                quantityString = AbstractC23136l9.m118698c0().getQuantityString(AbstractC7921d0.str_reaction_like_feed_count, i11, m108599D);
            }
            AbstractC19074t.m100205c(quantityString);
            return quantityString;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleLike);
        AbstractC19074t.m100205c(m118743r0);
        return m118743r0;
    }
}
