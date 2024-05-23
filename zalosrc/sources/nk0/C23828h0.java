package nk0;

import android.text.SpannableStringBuilder;
import com.zing.zalo.zinstant.zom.text.ZOMParagraph;
import com.zing.zalo.zinstant.zom.text.ZOMTextSpan;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;

/* renamed from: nk0.h0 */
/* loaded from: classes7.dex */
public final class C23828h0 {

    /* renamed from: a */
    public static final C23828h0 f115145a = new C23828h0();

    /* renamed from: b */
    private static Pattern f115146b;

    static {
        Pattern compile = Pattern.compile("\\w+");
        AbstractC19074t.m100207e(compile, "compile(\"\\\\w+\")");
        f115146b = compile;
    }

    private C23828h0() {
    }

    /* renamed from: b */
    public static final SpannableStringBuilder m124551b(LinkedList linkedList) {
        AbstractC19074t.m100208f(linkedList, "paragraph");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            spannableStringBuilder.append(((C23826g1) it.next()).m124543k());
        }
        return spannableStringBuilder;
    }

    /* renamed from: c */
    public static final SpannableStringBuilder m124552c(ZOMParagraph zOMParagraph) {
        AbstractC19074t.m100208f(zOMParagraph, "paragraph");
        zOMParagraph.resetIterator();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        while (true) {
            ZOMTextSpan nextTextSpan = zOMParagraph.getNextTextSpan();
            if (nextTextSpan != null) {
                spannableStringBuilder.append(nextTextSpan.getSpannableStringForMeasureOnly());
            } else {
                return spannableStringBuilder;
            }
        }
    }

    /* renamed from: a */
    public final Pattern m124553a() {
        return f115146b;
    }
}
