package io.dahgan

import org.junit.Test
import org.junit.runners.Parameterized

class SpecTest : AbstractSpecTest() {
    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "product file({0})")
        fun products(): Collection<Array<String>> = AbstractSpecTest.products("spec") { true }
//            file.startsWith("c-printable")
//                    || file.startsWith("nb-json")
//                    || file.startsWith("c-byte-order-mark")
//                    || file.startsWith("c-mapping-value")
//                    || file.startsWith("c-tag")
//                    || file.startsWith("c-collect-entry")
//                    || file.startsWith("c-comment")
//                    || file.startsWith("c-sequence-start")
//                    || file.startsWith("c-mapping-key")
//                    || file.startsWith("c-sequence-entry")
//                    || file.startsWith("c-literal")
//                    || file.startsWith("c-anchor")
//                    || file.startsWith("c-reserved")
//                    || file.startsWith("c-single-quote")
//                    || file.startsWith("c-folded")
//                    || file.startsWith("c-mapping-start")
//                    || file.startsWith("c-sequence-end")
//                    || file.startsWith("c-alias")
//                    || file.startsWith("c-directive")
//                    || file.startsWith("c-reserved")
//                    || file.startsWith("c-mapping-end")
//                    || file.startsWith("c-double-quote")
//                    || file.startsWith("c-indicator")
//                    || file.startsWith("c-flow-indicator")
//                    || file.startsWith("b-line-feed")
//                    || file.startsWith("b-carriage-return")
//                    || file.startsWith("b-char")
//                    || file.startsWith("nb-char")
//                    || file.startsWith("b-break")
//                    || file.startsWith("b-as-line-feed")
//                    || file.startsWith("b-non-content")
//                    || file.startsWith("s-space")
//                    || file.startsWith("s-tab")
//                    || file.startsWith("s-white")
//                    || file.startsWith("ns-char")
//                    || file.startsWith("ns-dec-digit")
//                    || file.startsWith("ns-hex-digit")
//                    || file.startsWith("ns-ascii-letter")
//                    || file.startsWith("ns-word-char")
//                    || file.startsWith("ns-uri-char")
//                    || file.startsWith("ns-tag-char")
//                    || file.startsWith("c-escape")
//                    || file.startsWith("ns-esc-null")
//                    || file.startsWith("ns-esc-bell")
//                    || file.startsWith("ns-esc-backspace")
//                    || file.startsWith("ns-esc-horizontal-tab")
//                    || file.startsWith("ns-esc-line-feed")
//                    || file.startsWith("ns-esc-vertical-tab")
//                    || file.startsWith("ns-esc-form-feed")
//                    || file.startsWith("ns-esc-carriage-return")
//                    || file.startsWith("ns-esc-escape")
//                    || file.startsWith("ns-esc-space")
//                    || file.startsWith("ns-esc-double-quote")
//                    || file.startsWith("ns-esc-slash")
//                    || file.startsWith("ns-esc-backslash")
//                    || file.startsWith("ns-esc-next-line")
//                    || file.startsWith("ns-esc-non-breaking-space")
//                    || file.startsWith("ns-esc-line-separator")
//                    || file.startsWith("ns-esc-paragraph-separator")
//                    || file.startsWith("ns-esc-8-bit")
//                    || file.startsWith("ns-esc-16-bit")
//                    || file.startsWith("ns-esc-32-bit")
//                    || file.startsWith("c-ns-esc-char")
//                    || file.startsWith("s-indent")
//                    || file.startsWith("s-separate-in-line")
//                    || file.startsWith("s-line-prefix")
//                    || file.startsWith("s-block-line-prefix")
//                    || file.startsWith("s-flow-line-prefix")
//                    || file.startsWith("l-empty")
//                    || file.startsWith("b-l-trimmed")
//                    || file.startsWith("b-as-space")
//                    || file.startsWith("b-l-folded")
//                    || file.startsWith("s-flow-folded")
//                    || file.startsWith("c-nb-comment-text")
//                    || file.startsWith("b-comment")
//                    || file.startsWith("s-b-comment")
//                    || file.startsWith("l-comment")
//                    || file.startsWith("s-l-comments")
//                    || file.startsWith("s-separate")
//                    || file.startsWith("s-separate-lines")
//                    || file.startsWith("l-directive.")
//                    || file.startsWith("ns-reserved-directive")
//                    || file.startsWith("ns-directive-name")
//                    || file.startsWith("ns-directive-parameter")
//                    || file.startsWith("ns-yaml-directive")
//                    || file.startsWith("ns-yaml-version")
//                    || file.startsWith("ns-tag-directive")
//                    || file.startsWith("c-tag-handle")
//                    || file.startsWith("c-primary-tag-handle")
//                    || file.startsWith("c-secondary-tag-handle")
//                    || file.startsWith("c-named-tag-handle")
//                    || file.startsWith("ns-tag-prefix")
//                    || file.startsWith("c-ns-local-tag-prefix")
//                    || file.startsWith("ns-global-tag-prefix")
//                    || file.startsWith("c-ns-properties")
//                    || file.startsWith("c-ns-tag-property")
//                    || file.startsWith("c-verbatim-tag")
//                    || file.startsWith("c-ns-shorthand-tag")
//                    || file.startsWith("c-non-specific-tag")
//                    || file.startsWith("c-ns-anchor-property")
//                    || file.startsWith("ns-anchor-char")
//                    || file.startsWith("ns-anchor-name")
//                    || file.startsWith("c-ns-alias-node")
//                    || file.startsWith("e-scalar")
//                    || file.startsWith("e-node")
//                    || file.startsWith("nb-double-char")
//                    || file.startsWith("ns-double-char")
//                    || file.startsWith("c-double-quoted")
//                    || file.startsWith("nb-double-text")
//                    || file.startsWith("nb-double-one-line")
//                    || file.startsWith("s-double-escaped")
//                    || file.startsWith("s-double-break")
//                    || file.startsWith("nb-ns-double-in-line")
//                    || file.startsWith("s-double-next-line")
//                    || file.startsWith("nb-double-multi-line")
//                    || file.startsWith("c-quoted-quote")
//                    || file.startsWith("nb-single-char")
//                    || file.startsWith("ns-single-char")
//                    || file.startsWith("c-single-quoted")
//                    || file.startsWith("nb-single-text")
//                    || file.startsWith("nb-single-one-line")
//                    || file.startsWith("nb-ns-single-in-line")
//                    || file.startsWith("s-single-next-line")
//                    || file.startsWith("nb-single-multi-line")
//                    || file.startsWith("ns-plain-first")
//                    || file.startsWith("ns-plain-safe")
//                    || file.startsWith("ns-plain-safe-out")
//                    || file.startsWith("ns-plain-safe-in")
//                    || file.startsWith("ns-plain-char")
//                    || file.startsWith("ns-plain")
//                    || file.startsWith("nb-ns-plain-in-line")
//                    || file.startsWith("ns-plain-one-line")
//                    || file.startsWith("s-ns-plain-next-line")
//                    || file.startsWith("ns-plain-multi-line")
//                    || file.startsWith("c-flow-sequence")
//                    || file.startsWith("ns-s-flow-seq-entries")
//                    || file.startsWith("ns-flow-seq-entry")
//                    || file.startsWith("c-flow-mapping")
//                    || file.startsWith("ns-s-flow-map-entries")
//                    || file.startsWith("ns-flow-map-entry")
//                    || file.startsWith("ns-flow-map-explicit-entry")
//                    || file.startsWith("ns-flow-map-implicit-entry")
//                    || file.startsWith("ns-flow-map-yaml-key-entry")
//                    || file.startsWith("c-ns-flow-map-empty-key-entry")
//                    || file.startsWith("c-ns-flow-map-separate-value")
//                    || file.startsWith("c-ns-flow-map-json-key-entry")
//                    || file.startsWith("c-ns-flow-map-adjacent-value")
//                    || file.startsWith("ns-flow-pair")
//                    || file.startsWith("ns-flow-pair-entry")
//                    || file.startsWith("ns-flow-pair-yaml-key-entry")
//                    || file.startsWith("c-ns-flow-pair-json-key-entry")
//                    || file.startsWith("ns-s-implicit-yaml-key")
//                    || file.startsWith("c-s-implicit-json-key")
//                    || file.startsWith("ns-flow-yaml-content")
//                    || file.startsWith("c-flow-json-content")
//                    || file.startsWith("ns-flow-content")
//                    || file.startsWith("ns-flow-yaml-node")
//                    || file.startsWith("c-flow-json-node")
//                    || file.startsWith("ns-flow-node")
//                    || file.startsWith("count-spaces")
//                    || file.startsWith("detect-scalar-indentation")
//                    || file.startsWith("detect-inline-indentation")
//                    || file.startsWith("detect-collection-indentation")
//                    || file.startsWith("c-b-block-header")
//                    || file.startsWith("c-indentation-indicator")
//                    || file.startsWith("c-chomping-indicator")
//                    || file.startsWith("b-chomped-last")
//                    || file.startsWith("l-chomped-empty")
//                    || file.startsWith("l-strip-empty")
//                    || file.startsWith("l-keep-empty")
//                    || file.startsWith("l-trail-comments")
//                    || file.startsWith("c-l+literal")
//                    || file.startsWith("l-nb-literal-text")
//                    || file.startsWith("b-nb-literal-next")
//                    || file.startsWith("l-literal-content")
//                    || file.startsWith("c-l+folded")
//                    || file.startsWith("s-nb-folded-text")
//                    || file.startsWith("l-nb-folded-lines")
//                    || file.startsWith("s-nb-spaced-text")
//                    || file.startsWith("b-l-spaced")
//                    || file.startsWith("l-nb-spaced-lines")
//                    || file.startsWith("l-nb-same-lines")
//                    || file.startsWith("l-nb-diff-lines")
//                    || file.startsWith("l-folded-content")
//                    || file.startsWith("l+block-sequence")
//                    || file.startsWith("c-l-block-seq-entry")
//                    || file.startsWith("s-l+block-indented")
//                    || file.startsWith("ns-l-in-line-sequence")
//                    || file.startsWith("l+block-mapping")
//                    || file.startsWith("ns-l-block-map-entry")
//                    || file.startsWith("c-l-block-map-explicit-entry")
//                    || file.startsWith("c-l-block-map-explicit-key")
//                    || file.startsWith("l-block-map-explicit-value")
//                    || file.startsWith("ns-l-block-map-implicit-entry")
//                    || file.startsWith("ns-s-block-map-implicit-key")
//                    || file.startsWith("c-l-block-map-implicit-value")
//                    || file.startsWith("ns-l-in-line-mapping")
//                    || file.startsWith("s-l+block-node")
//                    || file.startsWith("s-l+flow-in-block")
//                    || file.startsWith("s-l+block-in-block")
//                    || file.startsWith("s-l+block-scalar")
//                    || file.startsWith("s-l+block-collection")
//                    || file.startsWith("seq-spaces")
//                    || file.startsWith("l-document-prefix")
//                    || file.startsWith("c-directives-end")
//                    || file.startsWith("c-document-end")
//                    || file.startsWith("l-document-suffix")
//                    || file.startsWith("c-forbidden")
//                    || file.startsWith("l-bare-document")
//                    || file.startsWith("l-explicit-document")
//                    || file.startsWith("l-directives-document")
//                    || file.startsWith("l-any-document")
//                    || file.startsWith("l-yaml-stream")
//        }
    }

    @Test
    fun spec() {
        run()
    }
}