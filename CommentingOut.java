// @inproceedings{boucher_trojansource_2023,
//     title = {Trojan {Source}: {Invisible} {Vulnerabilities}},
//     author = {Nicholas Boucher and Ross Anderson},
//     booktitle = {32nd USENIX Security Symposium (USENIX Security 23)},
//     year = {2023},
//     address = {Anaheim, CA},
//     publisher = {USENIX Association},
//     month = aug,
//     url = {https://arxiv.org/abs/2111.00169}
// }
public class CommentingOut {

    public static void main(String[] args) {
        boolean isAdmin = false;
        /*‮ } ⁦if (isAdmin)⁩ ⁦ begin admins only */
            System.out.println("You are an admin.");
        /* end admins only ‮ { ⁦*/
    }

}
