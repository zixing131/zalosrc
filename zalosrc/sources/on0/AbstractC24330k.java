package on0;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import ln0.AbstractC22543l;
import ln0.C22537f;

/* renamed from: on0.k */
/* loaded from: classes7.dex */
public abstract class AbstractC24330k {
    /* renamed from: a */
    public static final /* synthetic */ InterfaceC24327h m127024a(Matcher matcher, int i11, CharSequence charSequence) {
        return m127026c(matcher, i11, charSequence);
    }

    /* renamed from: c */
    public static final InterfaceC24327h m127026c(Matcher matcher, int i11, CharSequence charSequence) {
        if (!matcher.find(i11)) {
            return null;
        }
        return new C24328i(matcher, charSequence);
    }

    /* renamed from: d */
    public static final C22537f m127027d(MatchResult matchResult, int i11) {
        C22537f m116593p;
        m116593p = AbstractC22543l.m116593p(matchResult.start(i11), matchResult.end(i11));
        return m116593p;
    }
}
