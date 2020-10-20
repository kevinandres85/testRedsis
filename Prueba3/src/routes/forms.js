const { Router } = require('express');
const router = Router();
const fetch = require('node-fetch');
let link = "";
router.get("/", async (req, res) => {
    const response = await fetch("https://securetransfer.redsis.com/rest/forms/v1/teamGoAny/payload");
    const cpayload = await response.json();
    res.json(cpayload);

});

router.post('/:id', async (req, res) => {
    const { id } = req.params;
    const response = await fetch("https://securetransfer.redsis.com/rest/forms/v1/teamGoAny/payload/" + id + "/submit");
    res.json(await response.json());

}
);

module.exports = router;