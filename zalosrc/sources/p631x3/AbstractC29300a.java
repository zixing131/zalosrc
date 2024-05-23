package p631x3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import p566v3.C27498f;

/* renamed from: x3.a */
/* loaded from: classes2.dex */
public abstract class AbstractC29300a {
    /* renamed from: a */
    public static List m146397a(List list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Stack stack = new Stack();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C27498f c27498f = (C27498f) it.next();
                if (c27498f.m140609d() == 0) {
                    stack.push(c27498f);
                    it.remove();
                }
            }
            while (!stack.isEmpty()) {
                C27498f c27498f2 = (C27498f) stack.pop();
                arrayList.add(c27498f2);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C27498f c27498f3 = (C27498f) it2.next();
                    if (c27498f3.m140609d() == c27498f2.m140608c()) {
                        stack.push(c27498f3);
                    }
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }
}
